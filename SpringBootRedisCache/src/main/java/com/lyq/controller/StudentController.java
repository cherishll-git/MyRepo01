package com.lyq.controller;

import com.lyq.pojo.Student;
import com.lyq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudent")
    public String getStuByStuno(@Qualifier("stuno") String stuno){
        Student student = studentService.queryStuBySno(stuno);
        return student.toString();
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentService.updateStu(student);
        return "update success";
    }


}
