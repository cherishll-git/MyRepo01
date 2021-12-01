package com.lyq.dao;

import com.lyq.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper {
    int add(Student student);
    int update(Student student);
    int deleteByIds(String sno);
    Student queryStudentById(String sno);
    List<Student> getAllStudents();
}
