package com.lyq.bootstrap;

import com.lyq.service.TestService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lyq.service")
public class ServcieBootStrap {
    public static void main(String[] args) {
        //拿到spring容器
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ServcieBootStrap.class).web(WebApplicationType.NONE).run(args);
        TestService testService = context.getBean("testService", TestService.class);
        System.out.println("TestService Bean:" + testService);
        context.close();
    }
}
