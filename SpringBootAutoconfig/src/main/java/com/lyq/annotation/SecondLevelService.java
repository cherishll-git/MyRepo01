package com.lyq.annotation;

import java.lang.annotation.*;

/**
 * 层次性：
 * @Component
 *    |__ @Service
 *            |___ @FirstLevelService
 *                      |___ @SecondLevelService
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelService
public @interface SecondLevelService {
    String value() default "";
}
