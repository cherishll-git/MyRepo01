package com.lyq.autocfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bamboo") //从配置文件中获取配置
public class BambooServerProperties {
    public static final String NAME = "bamboo_Server0";

    private String name = NAME;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
