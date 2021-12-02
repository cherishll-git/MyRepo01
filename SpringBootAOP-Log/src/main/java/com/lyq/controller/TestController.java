package com.lyq.controller;

import com.lyq.annotation.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Log("执行方法一")
    @RequestMapping("/method1")
    public void methodOne(){
        System.out.println("test1");
    }

    @Log("执行方法二")
    @RequestMapping("/method2")
    public String methodTwo() throws InterruptedException {
        Thread.sleep(2000);
        return "hello!!";
    }
}
