package com.lyq.mapper;

import com.lyq.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    void updateStu(Student student);

    void deleteStuBySno(String stuno);

    Student queryStuBySno(String stuno);
}
