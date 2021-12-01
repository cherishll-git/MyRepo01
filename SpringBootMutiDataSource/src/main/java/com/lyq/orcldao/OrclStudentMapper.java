package com.lyq.orcldao;

import com.lyq.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrclStudentMapper {
    int add(Student student);
    int update(Student student);
    int deleteByIds(String sno);
    Student queryStudentById(String sno);
    List<Map<String, Object>> getAllStudents();
}
