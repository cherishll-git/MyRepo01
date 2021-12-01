package com.lyq.service.impl;

import com.lyq.mysqldao.MysqlStudentMapper;
import com.lyq.orcldao.OrclStudentMapper;
import com.lyq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentServiceImp implements StudentService {
    @Autowired
    private OrclStudentMapper orclStudentMapper;
    @Autowired
    private MysqlStudentMapper mysqlStudentMapper;

    @Override
    public List<Map<String, Object>> getAllStudentsFromMysql() {
        return  mysqlStudentMapper.getAllStudents();
    }

    @Override
    public List<Map<String, Object>> getAllStudentsFromOrcl() {
        return orclStudentMapper.getAllStudents();
    }
}
