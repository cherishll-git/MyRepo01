package com.lyq.controller;

import com.lyq.starter.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StarterTestController {
    @Resource(name = "demoService")
    private DemoService demoService;

    @GetMapping("/say")
    public String sayWhat(){
        return demoService.say("张三");
    }
}
