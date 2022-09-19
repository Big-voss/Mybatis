package com.zongzhaobin.mybatis.mapper;

import com.zongzhaobin.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0911 10:35
 */
public interface UserMapper {
    User selectByUsername(String username);

    User checkLogin(String username,String password);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
