package com.wk.project.vo;

import com.wk.project.annotation.BirdEgg;
import com.wk.project.annotation.BirdEggs;
import com.wk.project.annotation.Egg;

import java.lang.annotation.Annotation;

/**
 * @Auther weikai2
 * @Date 2022/9/19
 * @Description
 **/
@BirdEgg(annotations = @Egg(weight = 10,mark = "this is a big bird"))
@BirdEgg(annotations = @Egg(weight = 10,mark = "this is a little bird"))
public class Bird {

    String largeOrSmall;
    int code;


    public static void main(String[] args) {
        VerifyClass();
        getRepeatedAnnotation();
    }

    public static void VerifyClass(){
        System.out.println("enter verify class...");
        Annotation[] annotations = Bird.class.getAnnotations();
        System.out.println(annotations.length);
        BirdEggs p1=(BirdEggs) annotations[0];
        for(BirdEgg t:p1.value()){
            System.out.println(t.annotations()[0].mark());
        }
    }

    public static void VerifyClassTwo(){
        System.out.println("enter verify class two...");
        if(Bird.class.isAnnotationPresent(BirdEgg.class)) {
            BirdEgg p2=Bird.class.getAnnotation(BirdEgg.class);
            for(Egg t:p2.annotations()){
                System.out.println(t.mark());
            }
        }
    }

    public static void getRepeatedAnnotation(){

        System.out.println("获取标记类上的重复注解：");
        if (Bird.class.isAnnotationPresent(BirdEggs.class)){
            BirdEggs birdEggs = Bird.class.getAnnotation(BirdEggs.class);
            for (BirdEgg schedule: birdEggs.value()){
                System.out.println(schedule);
            }
        }

    }

}
