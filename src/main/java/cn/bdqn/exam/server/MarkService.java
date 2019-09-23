package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Mark;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.entity.testpaperstep;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarkService {
    List<Mark> getAll();
    //删除
    int delect(@Param("markid") int markid);
    //添加
    int add(Mark mism);
    //修改
    int update(Mark mism);
    Mark getidAll(@Param("markid") int markid);
    //部门查询
    List<Dept> deptAll();
    //用户查询
    List<User> userAll();
    //试卷类型
    List<testpaperstep> testpaperstepAll();
}
