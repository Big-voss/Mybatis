package com.zongzhaobin.mybatis.test;

import com.zongzhaobin.mybatis.mapper.UserMapper;
import com.zongzhaobin.mybatis.pojo.User;
import com.zongzhaobin.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0911 11:08
 */
public class ParameterTest {
    @Test
    public void selectByUsernameTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByUsername("admin");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void checkLoginTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin","123456");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void checkLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admin", "123456");
        System.out.println(user);
        sqlSession.close();
    }
}
