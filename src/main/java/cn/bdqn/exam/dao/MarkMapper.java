package cn.bdqn.exam.dao;


import cn.bdqn.exam.entity.*;
import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Mark;
import cn.bdqn.exam.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

public interface MarkMapper {
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