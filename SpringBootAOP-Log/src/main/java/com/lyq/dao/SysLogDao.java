package com.lyq.dao;

import com.lyq.pojo.SysLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysLogDao {
    public void saveSysLog(SysLog sysLog);
}
