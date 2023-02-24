package com.wk.project.utils;

import com.wk.project.annotation.BirdEgg;
import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Auther weikai2
 * @Date 2022/9/20
 * @Description
 **/
@Slf4j
public class EggInstaller {

    public static void processAnnotation(Object obj){
        log.info("");
        try {
            Class<?> clazz = obj.getClass();
            BirdEgg comp = clazz.getAnnotation(BirdEgg.class);
            Annotation[] annotations = clazz.getAnnotations();
            log.info(String.valueOf(comp));
            log.info(String.valueOf(annotations));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void processField(Object obj){
        try {
            Class<?> clazz = obj.getClass();
            //获得私有的成员属性
            Field[] fields = clazz.getDeclaredFields();
            if(Objects.nonNull(fields) && fields.length>0){
                for(Field field : fields){
                    field.setAccessible(true);
                    //判断BirdEgg注解是否存在
                    if(field.isAnnotationPresent(BirdEgg.class)){
                        if(Objects.isNull(field.get(obj))){
                            field.set(obj, BigDecimal.ZERO);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
