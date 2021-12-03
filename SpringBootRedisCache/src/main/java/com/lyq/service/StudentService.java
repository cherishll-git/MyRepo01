package com.lyq.service;

import com.lyq.pojo.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

public interface StudentService {

    void updateStu(Student student);

    void deleteStuBySno(String stuno);

    Student queryStuBySno(String stuno);
}
