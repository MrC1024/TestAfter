package cn.bdqn.exam.dao;


import java.util.List;

import cn.bdqn.exam.entity.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    List<Dept> getAll();

    int getAdd(Dept dept);

    int del(@Param("deptid") int deptid);

    Dept updId(@Param("deptid") int deptid);

    int upd(Dept dept);



}