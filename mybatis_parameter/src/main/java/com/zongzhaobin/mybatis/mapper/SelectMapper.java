package com.zongzhaobin.mybatis.mapper;

import com.zongzhaobin.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0911 19:11
 */
public interface SelectMapper {
    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    List<Map<String,Object>> getAllUserToMap(@Param("id") Integer Id);
}
