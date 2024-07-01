package com.wk.project;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther weikai2
 * @Date 2022/8/26
 * @Description
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.wk.project.**.mapper")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);

    }




}
