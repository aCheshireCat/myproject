package com.wk.project.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther weikai2
 * @Date 2024/4/18
 * @Description
 **/
public class JacksonTest {


    @Test
    public void testJackson() throws JsonProcessingException {
        String json = "{\"tanxing\":\"1\",\"fujia\":\"\"}";
        String value = "{\"testtx\":\"cs2\",\"tanxing\":\"cs2\",\"fujia\":\"cs2\"}";
        System.out.println(value);

        String param = json;
        System.out.println("Param: " + param);

        System.out.println("------------------------");
        Map jacksonMap;
        jacksonMap = JsonUtil.jsonToMap(param);

        System.out.println("jacksonMap:" + jacksonMap);
        Map allMap = new HashMap();

        JsonUtil.jsonToMap(param,allMap);
        System.out.println("allMap:" + allMap);



        System.out.println("------------------------");
        System.out.println(JsonUtil.mapToJson(jacksonMap));





    }



}




















































































































































































