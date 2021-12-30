package com.lyq.configuration;

import com.lyq.annotation.EnableHelloWorld;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld
@ConditionalOnProperty(name="hello_world",havingValue = "true")
public class HelloWorldAutoConfiguration {
}
