package com.zongzhaobin.mybatis.test;

import com.zongzhaobin.mybatis.mapper.SpecialMapper;
import com.zongzhaobin.mybatis.pojo.User;
import com.zongzhaobin.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0911 22:41
 */
public class SpecialTest {
    @Test
    public void getUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }
    @Test
    public void getDeleteMore(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        int dele = mapper.deleteMore("3,4");
        System.out.println(dele);
        sqlSession.close();
    }
    @Test
    public void getUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void getInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        User user = new User(null,"xiaoming","123456",23,"男","123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
        sqlSession.close();
    }
    
    public void testJDBC() {
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("", "", "");
            String sql = "insert into t_user values()";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet resultSet = ps.getGeneratedKeys();
            resultSet.next();
            int id = resultSet.getInt(1);
        } catch (Exception e){
                  e.printStackTrace();
        }
    }
}
