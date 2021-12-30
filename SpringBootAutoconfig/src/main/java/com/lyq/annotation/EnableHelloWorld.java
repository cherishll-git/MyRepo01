package com.lyq.annotation;

import com.lyq.configuration.HelloWorldConfiguration;
import com.lyq.selector.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWorldConfiguration.class)//注解驱动，导入一个配置类
@Import(HelloWorldImportSelector.class)//接口编程，导入接口ImportSelector实现类
public @interface EnableHelloWorld {
}
