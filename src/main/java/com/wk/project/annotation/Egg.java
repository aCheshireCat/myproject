package com.wk.project.annotation;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Egg {

    long weight() default 0;
    String mark() default "";



}