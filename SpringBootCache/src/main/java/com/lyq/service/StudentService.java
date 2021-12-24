package com.lyq.service;

import com.lyq.pojo.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@CacheConfig(cacheNames = "student")
@Repository
public interface StudentService {
    @CachePut(key = "#p0.stuno")
    Student updateStu(Student student);

    @CacheEvict(key = "#p0", allEntries = true)
    void deleteStuBySno(String stuno);

    @Cacheable(key = "#p0")
    Student queryStuBySno(String stuno);
}
