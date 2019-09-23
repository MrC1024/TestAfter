package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 试题
 */
public interface TestService {
    List<Test> getAll();

    int delById(@Param("id") Integer id);

    int updTestStatus(@Param("id") Integer id);

    List<Test> QueryTestNameByLike(@Param("testname") String testname);

    List<Dept> QueryDeptAll();

    int addTest(Test test);

    Test QueryTestById(@Param("id") Integer id);

    Integer testCount();

    int updTest(Test test);
}
