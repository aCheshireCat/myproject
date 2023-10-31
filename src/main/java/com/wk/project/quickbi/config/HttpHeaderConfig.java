package com.wk.project.quickbi.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther weikai2
 * @Date 2023/10/24
 * @Description
 **/
@Configuration
@Data
public class HttpHeaderConfig {


    private static HttpHeaderConfig instance;
    private HttpHeaderConfig (){}
    public static synchronized HttpHeaderConfig getInstance() {
        if (instance == null) {
            instance = new HttpHeaderConfig(){{
                setAk("a8f64e98-6c03-4929-8bb6-8488e6d7a855");
                setSk("becdf2a5-29f4-4637-86eb-4cd87f458847");
                setXGwDebug("true");
            }};
        }
        return instance;
    }


    @Value("${quickbi.header.debug:true}")
    private String xGwDebug;
    @Value("${quickbi.header.ak:a8f64e98-6c03-4929-8bb6-8488e6d7a855}")
    private String ak;
    @Value("${quickbi.header.sk:becdf2a5-29f4-4637-86eb-4cd87f458847}")
    private String sk;


}
