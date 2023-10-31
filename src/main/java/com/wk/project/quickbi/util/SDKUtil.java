package com.wk.project.quickbi.util;

import com.alibaba.quickbi.openapi.HttpClientFactory;
import com.alibaba.quickbi.openapi.client.HttpMethod;
import com.alibaba.quickbi.openapi.client.HttpRequest;
import com.alibaba.quickbi.openapi.client.IOpenAPIClient;
import com.alibaba.quickbi.openapi.core.exception.SDKException;
import com.wk.project.quickbi.config.HttpHeaderConfig;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Auther weikai2
 * @Date 2023/10/31
 * @Description
 **/
public class SDKUtil {


        final static String ak = HttpHeaderConfig.getInstance().getAk();
        final static String sk = HttpHeaderConfig.getInstance().getSk();

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
                                  Boolean debug) throws SDKException {
                HttpRequest request = HttpRequest.build()
                        .setUri(uri)
                        .setMethod(HttpMethod.GET);

                //添加参数
                if (MapUtils.isNotEmpty(parameterMap)) {
                        parameterMap.forEach((key, value) -> {
                                request.addParameter(key, value);
                        });
                }
                // 是否开启调试模式，仅用于测试调试
                if(debug){
                        request.addHeader("X-Gw-Debug", "true");
                }

                String result = client.syncExecute(request);
                return result;

        }
        public static String get(String uri,Map<String, String> parameterMap) throws SDKException {
                return get(uri,parameterMap,Boolean.FALSE);
        }

        public static String post(String uri, Map<String,
                String> parameterMap, Boolean debug) throws SDKException {
                HttpRequest request = HttpRequest.build()
                        .setUri(uri)
                        .setMethod(HttpMethod.POST);

                //添加参数
                if (MapUtils.isNotEmpty(parameterMap)) {
                        parameterMap.forEach((key, value) -> {
                                request.addParameter(key, value);
                        });
                }
                if(debug){
                        request.addHeader("X-Gw-Debug", "true");
                }
                // request.setHttpContentType(FormatType.FORM);

                String result = client.syncExecute(request);
                return result;

        }
        public static String post(String uri,Map<String, String> parameterMap) throws SDKException {
                return post(uri,parameterMap,Boolean.FALSE);
        }










}