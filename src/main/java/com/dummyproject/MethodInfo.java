package com.dummyproject;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Shivanjali";
    String date();
    int revision() default 1;
    String comments();
}
