package com.zongzhaobin.mybatis.mapper;

import com.zongzhaobin.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0911 22:36
 */
public interface SpecialMapper {
    List<User> getUserByLike(@Param("mohu") String mohu);

    int deleteMore(@Param("ids") String ids);

    List<User> getUserList(@Param("tableName") String tableName);

    void insertUser(User user);
}
