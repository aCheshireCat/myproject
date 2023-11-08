package com.wk.project.quickbi.util;

import com.alibaba.quickbi.openapi.HttpClientFactory;
import com.alibaba.quickbi.openapi.client.FormatType;
import com.alibaba.quickbi.openapi.client.HttpMethod;
import com.alibaba.quickbi.openapi.client.HttpRequest;
import com.alibaba.quickbi.openapi.client.IOpenAPIClient;
import com.alibaba.quickbi.openapi.core.exception.SDKException;
import com.wk.project.quickbi.config.HttpHeaderConfig;
import org.apache.commons.collections4.MapUtils;

import java.util.Map;

/**
 * @Auther weikai2
 * @Date 2023/10/31
 * @Description
 **/
public class SdkUtil {

        private SdkUtil(){}

        private final static String ak = HttpHeaderConfig.getInstance().getAk();
        private final static String sk = HttpHeaderConfig.getInstance().getSk();

        // host 域名
        final static String host = "https://quickbi.longi.com";

        // 根路径。（有定制根路径时设置 rootPath = "/XXX",一般为null）
        final static String rootPath = null;

        // rootpath是否加入签名的字符串拼接。
        final static boolean encodeRootPath = false;

        // 初识化客户端
        private static IOpenAPIClient client =
                HttpClientFactory.buildDefaultClient(host, rootPath, encodeRootPath,
                        ak, sk, true);

        public static String get(String uri,
                                  Map<String, String> parameterMap,
                                  boolean debug,
                                 FormatType formatType) throws SDKException {
                HttpRequest request = HttpRequest.build()
                        .setUri(uri)
                        .setMethod(HttpMethod.GET);

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
                // 是否开启调试模式，仅用于测试调试
                if(debug){
                        request.addHeader("X-Gw-Debug", "true");
                }

                return client.syncExecute(request);

        }
        public static String get(String uri,Map<String, String> parameterMap) throws SDKException {
                return get(uri,parameterMap,FormatType.FORM);
        }
        public static String get(String uri,Map<String, String> parameterMap,FormatType formatType) throws SDKException {
                return get(uri,parameterMap,false,formatType);
        }

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
        public static String post(String uri,Map<String, String> parameterMap,FormatType formatType) throws SDKException {
                return post(uri,parameterMap,false,formatType);
        }
        public static String post(String uri,Map<String, String> parameterMap) throws SDKException {
                return post(uri,parameterMap,FormatType.FORM);
        }










}