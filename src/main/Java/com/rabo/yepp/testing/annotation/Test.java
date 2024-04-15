package com.rabo.yepp.testing.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD}) // Method only.
public @interface Test {

    // Skip this test?
    boolean skip() default false;
    String testComment() default "";

}