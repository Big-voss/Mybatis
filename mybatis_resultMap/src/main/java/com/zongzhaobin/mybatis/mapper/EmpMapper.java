package com.zongzhaobin.mybatis.mapper;

import com.zongzhaobin.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0912 15:40
 */
public interface EmpMapper {
    Emp getEmpById(@Param("empId") Integer EmpId);

    Emp getEmpAndDeptByEmpId(@Param("empId") Integer EmpId);

    Emp getEmpAndDeptByStepOne(@Param("empId") Integer EmpId);

}
