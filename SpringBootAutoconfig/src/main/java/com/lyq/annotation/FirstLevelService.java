package com.lyq.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @FirstLevelService为@Component派生出来的模式注解:
 * @Component
 *    |__ @Service
 *            |___ @FirstLevelService
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface FirstLevelService {
    String value() default "";
}
