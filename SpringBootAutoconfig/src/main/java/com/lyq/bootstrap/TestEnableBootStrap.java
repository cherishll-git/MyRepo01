package com.lyq.bootstrap;

import com.lyq.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorld
public class TestEnableBootStrap {
    public static void main(String[] args) {
        //拿到spring容器
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestEnableBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String hello = context.getBean("hello", String.class);
        System.out.println("hello Bean:" + hello);
        context.close();
    }
}
