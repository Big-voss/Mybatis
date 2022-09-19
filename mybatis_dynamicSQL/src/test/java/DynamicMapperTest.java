import com.zongzhaobin.mybatis.mapper.DynamicSQLMapper;
import com.zongzhaobin.mybatis.pojo.Emp;
import com.zongzhaobin.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0913 9:17
 */
public class DynamicMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"李四",null,"");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);

    }
    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"",20,"女");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out::println);

    }

    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null,"小明",20,"男");
        Emp emp2 = new Emp(null,"小李",21,"女");
        Emp emp3 = new Emp(null,"小黃",22,"男");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list);
    }

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = new Integer[]{6,7};
        mapper.deleteMoreEmp(empIds);
    }
}
