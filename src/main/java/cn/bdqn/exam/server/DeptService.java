package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptService {
    List<Dept> getAll();

    int getAdd(Dept dept);

    int del(@Param("deptid") int deptid);

    Dept updId(int deptid);

    int upd(Dept dept);




}
