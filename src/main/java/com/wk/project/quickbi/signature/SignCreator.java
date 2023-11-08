package com.wk.project.quickbi.signature;

import com.alibaba.fastjson.JSON;
import com.alibaba.quickbi.openapi.HttpClientFactory;
import com.alibaba.quickbi.openapi.client.FormatType;
import com.alibaba.quickbi.openapi.client.HttpMethod;
import com.alibaba.quickbi.openapi.client.HttpRequest;
import com.alibaba.quickbi.openapi.client.IOpenAPIClient;
import com.alibaba.quickbi.openapi.common.CommonConstants;
import com.alibaba.quickbi.openapi.core.exception.SDKException;
import com.alibaba.quickbi.openapi.core.util.StringUtils;
import com.wk.project.quickbi.model.vo.GlobalParam;
import com.wk.project.quickbi.model.vo.GlobalValueParam;
import org.apache.commons.collections4.MapUtils;
import org.junit.Test;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @Auther weikai2
 * @Date 2023/10/13
 * @Description
 **/
public class SignCreator {
    final static String accessid = "a8f64e98-6c03-4929-8bb6-8488e6d7a855";
    final static String secretKey = "becdf2a5-29f4-4637-86eb-4cd87f458847";

    final static String host = "https://quickbi.longi.com";

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {

        String url = "/openapi/v2/embed/ticket/create";
        String timestamp = String.valueOf(System.currentTimeMillis());
        String uuid = UUID.randomUUID().toString();
        String strToSign = "";
        String sign = "";
//        String sign = "UUgfJAC46d+lg+tv4Vj9HbieXuL14BdCMmIzZGI/iRM=";
//        String strToSign = "POST /openapi/v2/embed/ticket/create globalParam=[{\"conditionList\":[{\"operate\":\"like\",\"value\":\"\"}],\"joinType\":\"and\",\"paramKey\":\"dictCode\"},{\"conditionList\":[{\"operate\":\"like\",\"value\":\"\"}],\"joinType\":\"and\",\"paramKey\":\"dictName\"}]&ticketNum=2&worksId=86fa1681-8c97-4d39-8683-3f2aaecc9480 X-Gw-AccessId:a8f64e98-6c03-4929-8bb6-8488e6d7a855 X-Gw-Nonce:1f4224a1-0f65-4357-8fda-cbd349faebd4 X-Gw-Timestamp:1698388940895";
//        String timestamp = "1698395252950";
//        String uuid = "c9d8436c-4021-4108-bdfb-3062747e17b1";
        String method = HttpMethod.POST.name();
        String globalParam = constractParam();
        System.out.println(globalParam);
//        globalParam = percentEncode(globalParam);
//        System.out.println(globalParam);

        Map<String,String> headers = new HashMap<String,String>(){{
            put(CommonConstants.HEADER_ACCESSID,accessid);
            put(CommonConstants.HEADER_TIMESTAMP,timestamp);
            put(CommonConstants.HEADER_NONCE,uuid);
        }};
        Map<String,String> parameters = new HashMap<>();
        parameters.put("worksId","86fa1681-8c97-4d39-8683-3f2aaecc9480");
        parameters.put("ticketNum","2");
        parameters.put("globalParam",globalParam);


        System.out.println(method);
        System.out.println(url);
        System.out.println(globalParam);
        System.out.println(uuid);
        System.out.println(timestamp);

        strToSign = buildStringToSign(url,method,parameters,headers);
        System.out.println(strToSign);

//        string_to_sign = percentEncode(string_to_sign);
//        System.out.println(string_to_sign);

        sign = sign(strToSign,secretKey);
        System.out.println(sign);




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
            System.out.println("paramters:" + queryString);
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
        System.out.println("buildSortedString:"+ sb.toString());
        return sb.toString();
    }

    private  static String percentEncode(String value) throws UnsupportedEncodingException {
        return value != null ? URLEncoder.encode(value, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~") : null;
    }

    public static String sign(String stringToSign, String secretKey) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        if (null == stringToSign || null == secretKey) {
            throw new IllegalArgumentException("input parameter error");
        }
        String encodeString = percentEncode(stringToSign);
        return sha256(encodeString, secretKey);
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


    private static String constractParam() throws UnsupportedEncodingException {
        List<GlobalParam> paramList = new ArrayList<GlobalParam>(){{
            add(new GlobalParam(){{
                setParamKey("dictCode");
                setJoinType("and");
                setConditionList(new ArrayList<GlobalValueParam>(){{
                    add(new GlobalValueParam(){{
                        setOperate("like");
                        setValue("case");
                    }});
                }});
            }});
            add(new GlobalParam(){{
                setParamKey("dictName");
                setJoinType("and");
                setConditionList(new ArrayList<GlobalValueParam>(){{
                    add(new GlobalValueParam(){{
                        setOperate("like");
                        setValue(percentEncode("经典"));
                    }});
                }});
            }});
        }};
        String paramJson = JSON.toJSONString(paramList);

        return paramJson;
    }


    private static IOpenAPIClient client =
            HttpClientFactory.buildDefaultClient(host, null, false,
                    accessid, secretKey, true);
    public static String post(String uri, Map<String,
            String> parameterMap, boolean debug, FormatType formatType) throws SDKException {
        HttpRequest request = HttpRequest.build()
                .setUri(uri)
                .setMethod(HttpMethod.POST);

        //添加参数
        if (MapUtils.isNotEmpty(parameterMap)) {
            parameterMap.forEach(request::addParameter);
        }
        switch (formatType){
            case FORM:request.setHttpContentType(FormatType.FORM);
                break;
            case JSON:request.setHttpContentType(FormatType.JSON);
                break;
            default:
        }
        if(debug){
            request.addHeader("X-Gw-Debug", "true");
        }

        return client.syncExecute(request);

    }

    @Test
    public void testPost() throws SDKException {
        String uri = "/openapi/v2/embed/ticket/create";
        String value = URLEncoder.encode("经典");
        String param = "[{\"conditionList\":[{\"operate\":\"like\",\"value\":\"case\"}],\"joinType\":\"and\",\"paramKey\":\"dictCode\"},{\"conditionList\":[{\"operate\":\"like\",\"value\":\"" + value + "\"}],\"joinType\":\"and\",\"paramKey\":\"dictName\"}]";
        Map<String,String> paramMap = new HashMap<String,String>(){{
            put("worksId", "86fa1681-8c97-4d39-8683-3f2aaecc9480");
            put("ticketNum", "2");
            put("globalParam",URLEncoder.encode(param));
        }};
        String result = post(uri,paramMap,true,FormatType.FORM);
        System.out.println(result);
    }

}
