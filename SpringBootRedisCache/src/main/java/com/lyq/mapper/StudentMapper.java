package com.lyq.mapper;

import com.lyq.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@Mapper
@CacheConfig(cacheNames = "student")
public interface StudentMapper {

    @CachePut(key = "#p0.stuno")
    void updateStu(Student student);

    @CacheEvict(key = "#p0", allEntries = true)
    void deleteStuBySno(String stuno);

    @Cacheable(key = "#p0")
    Student queryStuBySno(String stuno);
}
