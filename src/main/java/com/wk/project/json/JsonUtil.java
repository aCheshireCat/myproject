package com.wk.project.json;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.wk.project.json.mapper.JacksonMapper;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Auther weikai2
 * @Date 2024/2/29
 * @Description
 **/
public class JsonUtil {


    public static Map jsonToMap(String json) throws JsonProcessingException {

        if(StringUtils.isNotEmpty(json)){
            ObjectMapper mapper = new ObjectMapper();
//            JacksonMapper jm = new JacksonMapper();
//            SimpleModule simpleModule = new SimpleModule();
//            simpleModule.addDeserializer(Map.class, new MapDeserializer());
//            mapper.getSerializerProvider().setNullValueSerializer(MapSerializer);
           return mapper.readValue(json, Map.class);

        }else{
            return null;
        }
    }

    public static void jsonToMap(String json,Map<?,?> resultMap) throws JsonProcessingException {

        if(StringUtils.isNotEmpty(json) && resultMap!=null){
            final ObjectMapper mapper = new ObjectMapper();
            Map map  = mapper.readValue(json, Map.class);
            resultMap.putAll(map);
        }
    }


    public static String mapToJson(Map<String,String> map) throws JsonProcessingException {

        String result = "";
        if(MapUtils.isNotEmpty(map)){
            final ObjectMapper mapper = new ObjectMapper();
            result=mapper.writeValueAsString(map);

        }
        return result;
    }

    public static void main(String[] args) throws JsonProcessingException {

        String json = "{\"tanxing\":\"1\",\"fujia\":\"\"}";
        String value = "{\"testtx\":\"cs2\",\"tanxing\":\"cs2\",\"fujia\":\"cs2\"}";
        System.out.println(value);

//        Map<String, String> map = new HashMap<>();
//        map.put("name1","张三");
//        map.put("name2","李四") ;
//        String mapJson = JsonUtil.mapToJson(map);



        String pringParam = value;
        System.out.println("pringParam: " + pringParam);

        System.out.println("------------------------");
//        ObjectMapper mapper = new ObjectMapper();
//        Map jacksonMap  = mapper.readValue(pringParam, Map.class);
        Map jacksonMap;
        jacksonMap = JsonUtil.jsonToMap(pringParam);


        System.out.println("jacksonMap:" + jacksonMap);
        System.out.println(JsonUtil.mapToJson(jacksonMap));



        System.out.println("------------------------");

        Map fastjsonMap = JSONObject.parseObject(pringParam, Map.class);
        System.out.println("fastjsonMap:" + fastjsonMap);
        System.out.println(JSONObject.toJSON(fastjsonMap));


    }




}
