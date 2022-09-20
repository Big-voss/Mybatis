package com.zongzhaobin.mybatis.mapper;

import com.zongzhaobin.mybatis.pojo.User;

import java.util.List;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0905 19:34
 */
public interface UserMapper {
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();
}
