package com.lyq.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean("hello")
    public String hello(){
        return "Hello word!";
    }
}
