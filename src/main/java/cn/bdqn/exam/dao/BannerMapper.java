package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Banner;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface BannerMapper {
    List<Banner> getAll();//查全部
    int del(int ifSel);  //删除  状态改为0
    int add(Banner banner);
    int upd(Banner banner);
    List<Banner> getPage(@Param("num1") Integer num1, @Param("num2") Integer num2); //分页
    int count();   //查count(*)
    List<Banner> byban(String banPath);



}