package com.lyq.service.impl;

import com.lyq.mapper.StudentMapper;
import com.lyq.pojo.Student;
import com.lyq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void updateStu(Student student) {
        studentMapper.updateStu(student);
    }

    @Override
    public void deleteStuBySno(String stuno) {

    }

    @Override
    public Student queryStuBySno(String stuno) {
        return studentMapper.queryStuBySno(stuno);
    }
}
