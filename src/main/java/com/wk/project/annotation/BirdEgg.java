package com.wk.project.annotation;

import com.wk.project.enums.Shape;
import com.wk.project.vo.Bird;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BirdEggs.class)
public @interface BirdEgg{

    //int 编号
    int code() default 0;
    //String 大小描述
    String description() default "";
    //枚举 形状
    Shape shape() default Shape.NORMAL;
    //类 功能
    Class classname() default Bird.class;
    //注解
    Egg[] annotations() default @Egg(weight = 0);
    //数组 所属地区
    String[] localArea() default {"Asia","Europe"};
    //boolean 是否自定义
    boolean isDefine() default false;

    char attributeOne() default 0;

    byte attributeTwo() default 0;

    short attributeThree() default 0;

    long attributeFour() default 0;

    double attributeFive() default 0;

    float attributeSix() default 0;



}
