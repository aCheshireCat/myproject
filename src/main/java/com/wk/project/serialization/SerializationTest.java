package com.wk.project.serialization;

import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wk.project.vo.UserLoginRequestVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class SerializationTest {

    public static final String YYYYMMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(DateUtil.format(date,YYYYMMDD_HHMMSS));
    }


    /**
     * 验证序列化及反序列化
     *     @JsonSerialize(using = LocalDateSerializer.class)
     *     @JsonDeserialize(using = LocalDateDeserializer.class)
     */
    @Test
    public void test(){

        LocalDate now = LocalDate.now();
        List<UserLoginRequestVo> res = Arrays.asList(
                new UserLoginRequestVo("001","123",now),
                new UserLoginRequestVo("002","1234",now)
        );
        log.info("网上发票查询数据为==========="+res);
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(res);
            log.info("序列化==========="+json);
            List<UserLoginRequestVo> list = objectMapper.readValue(json, new TypeReference<List<UserLoginRequestVo>>() {});
            log.info("反序列化==========="+list);

        }catch (Exception e){
            e.getMessage();
            throw new RuntimeException(e);
        }
    }


    private static String getJson() {
        StringBuilder sb = new StringBuilder ();

        String filePath = "1.txt";
        String content = "";
        try {
            content = Files.lines(Paths.get(filePath))
                    .collect(Collectors.joining("\n"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("getJson:" + content);
        return content;
    }


}
