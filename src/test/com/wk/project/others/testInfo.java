package com.wk.project.others;

import com.wk.project.annotation.BirdEgg;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.Annotation;

/**
 * @Auther weikai2
 * @Date 2022/9/13
 * @Description
 **/
@Data
@BirdEgg
@SpringBootApplication
public class testInfo {

    public static void main(String[] args) {
            SpringApplication.run(testInfo.class, args);

        BirdEgg comp = testInfo.class.getAnnotation(BirdEgg.class);
        Annotation[] annotations = testInfo.class.getAnnotations();

        System.out.println(comp);
        System.out.println("------------------------");
        System.out.println(annotations);

    }
}
