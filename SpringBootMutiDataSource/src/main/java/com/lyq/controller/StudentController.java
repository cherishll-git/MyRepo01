package com.lyq.controller;

import com.lyq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

    @RequestMapping("/allStuFromMysql")
    public List<Map<String, Object>> getAllStudents(){
        return studentService.getAllStudentsFromMysql();
    }

    @RequestMapping("/allStuFromOrcl")
    public List<Map<String, Object>> getAllStudentsFromOrcl(){
        return studentService.getAllStudentsFromOrcl();
    }
}
