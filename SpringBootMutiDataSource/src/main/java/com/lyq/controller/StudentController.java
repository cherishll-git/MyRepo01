package com.lyq.controller;

import com.lyq.pojo.Student;
import com.lyq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

    @RequestMapping("/allStu")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
