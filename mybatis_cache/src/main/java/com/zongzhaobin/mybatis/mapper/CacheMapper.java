package com.zongzhaobin.mybatis.mapper;

import com.zongzhaobin.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0913 15:13
 */
public interface CacheMapper {
    Emp getEmpById(@Param("empId") Integer empId);

    void insertEmp(Emp emp);
}
