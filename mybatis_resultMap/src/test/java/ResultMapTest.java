import com.zongzhaobin.mybatis.mapper.DeptMapper;
import com.zongzhaobin.mybatis.mapper.EmpMapper;
import com.zongzhaobin.mybatis.pojo.Dept;
import com.zongzhaobin.mybatis.pojo.Emp;
import com.zongzhaobin.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0912 16:16
 */
public class ResultMapTest {
    @Test
    public void getEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp = mapper.getEmpById(1);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void getEmpAndDeptByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void getEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByStepOne = mapper.getEmpAndDeptByStepOne(1);
        System.out.println(empAndDeptByStepOne.getEmpName());
        sqlSession.close();
    }
    @Test
    public void getDeptAndEmpByDeptId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByDeptId);
        sqlSession.close();
    }
    @Test
    public void getDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(deptAndEmpByDeptId);
        sqlSession.close();
    }
}
