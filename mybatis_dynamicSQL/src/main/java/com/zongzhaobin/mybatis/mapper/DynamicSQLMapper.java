package com.zongzhaobin.mybatis.mapper;

import com.zongzhaobin.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0913 9:02
 */
public interface DynamicSQLMapper {
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    void insertMoreEmp(@Param("emps") List<Emp> emps);

    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
