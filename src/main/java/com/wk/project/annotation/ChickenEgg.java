package com.wk.project.annotation;

import com.wk.project.enums.Shape;
import com.wk.project.vo.Bird;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ChickenEgg {

    int code() default 0;
    long weight() default 0;

    String largeOrSmall() default "";
    Shape shape() default Shape.NORMAL;
    Class classname() default Bird.class;
    Egg annotations() default @Egg(weight = 10);

    int[] children() default {};
    String[] childrenLargeOrSmall() default {};


}
