package com.lyq.autocfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 自动配置类
 *      根据条件判断是否需要自动配置，满足条件则创建Bean
 */
@Configuration //标记为配置类
@EnableConfigurationProperties(BambooServerProperties.class) //声明开启注入
@ConditionalOnClass(BambooServer.class)//判断BambooServer这个类在类路径中是否存在
@ConditionalOnProperty(prefix = "bamboo",value = "enabled",matchIfMissing = true) //当bamboo=enabled的情况下，如果没有设置则默认为true，即条件符合
//@Component//如果这里添加了注解那么在自动配置类的时候就不用添加@enableConfigurationProperties(HelloProperties.class)注解.
public class BmbooServiceAutoConfiguration {
    @Autowired
    private BambooServerProperties bsp;

    @Bean(name="bambooServer")
    @ConditionalOnMissingBean(BambooServer.class)//当容器中没有这个Bean时(BambooServer)就自动配置这个Bean，Bean的参数来自于BambooServerProperties
    public BambooServer mistraService(){
        BambooServer mistraService = new BambooServer();
        mistraService.setName(bsp.getName());
        return mistraService;
    }
}
