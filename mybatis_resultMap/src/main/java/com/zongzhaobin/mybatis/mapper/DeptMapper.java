package com.zongzhaobin.mybatis.mapper;

import com.zongzhaobin.mybatis.pojo.Dept;
import com.zongzhaobin.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0912 19:20
 */
public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);

    Emp getDeptAndEmpByStepTwo(@Param("deptId") Integer DeptId);
}
