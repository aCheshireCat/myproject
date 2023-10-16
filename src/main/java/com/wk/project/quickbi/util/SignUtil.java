package com.wk.project.quickbi.util;

import com.alibaba.quickbi.openapi.client.HttpMethod;
import com.alibaba.quickbi.openapi.common.CommonConstants;
import com.alibaba.quickbi.openapi.core.util.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @Auther weikai2
 * @Date 2023/10/16
 * @Description
 **/
public class SignUtil {


    private final static String accessid = "a8f64e98-6c03-4929-8bb6-8488e6d7a855";
    private final static String secretKey = "becdf2a5-29f4-4637-86eb-4cd87f458847";

    private static String getSign(String url,HttpMethod method) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {

        String timestamp = String.valueOf(System.currentTimeMillis());
        String uuid = UUID.randomUUID().toString();
        String methodName = method.name();
        Map<String,String> headers = new HashMap<String,String>(){{
            put(CommonConstants.HEADER_ACCESSID,accessid);
            put(CommonConstants.HEADER_TIMESTAMP,timestamp);
            put(CommonConstants.HEADER_NONCE,uuid);
        }};
        Map<String,String> parameters = new HashMap<String,String>();

        System.out.println(timestamp);
        System.out.println(uuid);

        String stringToSign = buildStringToSign(url,methodName,parameters,headers);
        System.out.println(stringToSign);

        String sign = sign(stringToSign,secretKey);
        System.out.println(sign);

        return sign;
    }




    /**
     * 构建待签名的字符串
     * * @param uri        请求的URI
     * @param method     方法，GET、POST
     * @param headers    参与签名的请求头
     * @param parameters 参与签名的请求参数。
     * @return
     */
    public static String buildStringToSign(String uri, String method,
                                           Map<String, String> parameters,
                                           Map<String, String> headers) {
        if (StringUtils.isEmpty(uri) || StringUtils.isEmpty(method)) {
            throw new IllegalArgumentException("input parameter error, uri or method can not be null");
        }
        // URL中。按照原始符号 --> 浏览器URL编码 --> spring web解析接收，对于加号（+）和空格， 有如下问题：
        // +   -> %2B --> 空格；
        // 空格 -> %20 --> 空格；因此，对于spring web接收到的请求，并不清楚空格的原始对应，是 + 还是空格
        // 因此，此处对于源头所有的+，按照空格处理
        uri = uri.replace("+", " ");

        // method
        StringBuilder sb = new StringBuilder();
        sb.append(method.toUpperCase());
        sb.append(CommonConstants.LF);

        // uri
        sb.append(uri);
        sb.append(CommonConstants.LF);

        // paramters
        if (null != parameters && parameters.size() > 0) {
            String queryString = buildSortedString(parameters, "=", "&");
            if (StringUtils.isNotEmpty(queryString)) {
                sb.append(queryString);
                sb.append(CommonConstants.LF);
            }
        }
        // headers
        if (null != headers && headers.size() > 0) {
            String headerString = buildSortedString(headers, ":", "\n");
            if (StringUtils.isNotEmpty(headerString)) {
                sb.append(headerString);
            }
        }
        return sb.toString();
    }

    /**
     * 将map中的元素，按照key的字母顺序，进行排序
     * * @param maps
     * @return
     */
    private static String buildSortedString(Map<String, String> maps, String symbol1, String symbol2) {
        StringBuilder sb = new StringBuilder();
        List<String> keys = new LinkedList<String>();
        for (String key : maps.keySet()) {
            keys.add(key);
        }
        Collections.sort(keys);

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = maps.get(key);
            // key或者value为空或null，不加入字符串的拼接
            if (null == key || key.trim().length() == 0
                    || null == value || value.trim().length() == 0) {
                continue;
            }
            sb.append(key);
            sb.append(symbol1);
            sb.append(value);
            if (i != keys.size() - 1) {
                sb.append(symbol2);
            }
        }
        return sb.toString();
    }

    public static String sign(String stringToSign, String secretKey) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        if (null == stringToSign || null == secretKey) {
            throw new IllegalArgumentException("input parameter error");
        }
        String encodeString = percentEncode(stringToSign);
        return sha256(encodeString, secretKey);
    }

    private  static String percentEncode(String value) throws UnsupportedEncodingException {
        return value != null ? URLEncoder.encode(value, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~") : null;
    }

    public static String sha256(String content, String secret) throws NoSuchAlgorithmException,
            UnsupportedEncodingException, InvalidKeyException {
        Mac hamcSha256 = Mac.getInstance("HmacSHA256");
        byte[] keyBytes = secret.getBytes("UTF-8");
        SecretKeySpec secretKey = new SecretKeySpec(keyBytes, 0, keyBytes.length, "HmacSHA256");
        hamcSha256.init(secretKey);
        byte[] result = hamcSha256.doFinal(content.getBytes("UTF-8"));
        return new String(Base64.getEncoder().encode(result));
    }


}
