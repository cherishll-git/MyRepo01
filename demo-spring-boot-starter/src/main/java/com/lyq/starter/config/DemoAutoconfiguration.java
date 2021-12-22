package com.lyq.starter.config;

import com.lyq.starter.properties.DemoProperties;
import com.lyq.starter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@Configuration
@EnableConfigurationProperties(DemoProperties.class)//该注解开启对DemoProperties中@ConfigurationProperties 注解配置Bean的支持
@ConditionalOnProperty(
        prefix = "demo",
        name = "isopen",
        havingValue = "true"
)
public class DemoAutoconfiguration {
    @Autowired
    private DemoProperties demoProperties;

    @Bean
    public DemoService demoService(){
        DemoService demoService = new DemoService();
        demoService.setDemoProperties(demoProperties);
        return demoService;
    }
}
