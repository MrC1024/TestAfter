package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Banner;
import cn.bdqn.exam.entity.SelMX;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelMXMapper {
    List<SelMX> getAll();
    int del(int ifSel);
    int count();   //查count(*)
    List<SelMX> getPage(@Param("num1") Integer num1, @Param("num2") Integer num2); //分页
    List<SelMX> cha(String name);
}
