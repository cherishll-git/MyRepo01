package com.lyq.service.impl;

import com.lyq.mapper.StudentMapper;
import com.lyq.pojo.Student;
import com.lyq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student updateStu(Student student) {
        studentMapper.updateStu(student);
        return studentMapper.queryStuBySno(student.getStuno());
    }

    @Override
    public void deleteStuBySno(String stuno) {
        studentMapper.deleteStuBySno(stuno);
    }

    @Override
    public Student queryStuBySno(String stuno) {
        return studentMapper.queryStuBySno(stuno);
    }
}
