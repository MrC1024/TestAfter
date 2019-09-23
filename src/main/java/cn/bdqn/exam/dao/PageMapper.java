package cn.bdqn.exam.dao;


import cn.bdqn.exam.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PageMapper {
    List<Dept> getPage(@Param("num1") Integer num1, @Param("num2") Integer num2);

    int count();   //获取总条数

}