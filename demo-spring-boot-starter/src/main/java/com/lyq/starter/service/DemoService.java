package com.lyq.starter.service;

import com.lyq.starter.properties.DemoProperties;

/**
 * 定义个service
 */
public class DemoService {
    DemoProperties demoProperties;

    public DemoProperties getDemoProperties() {
        return demoProperties;
    }

    public void setDemoProperties(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    public String say(String name){
        return name + "对" + demoProperties.getToWho() + "说:“" + demoProperties.getSayWhat() + "”";
    }
}
