package cn.bdqn.exam.dao;


import cn.bdqn.exam.dao.*;
import cn.bdqn.exam.entity.Integral;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IntegralMapper {
    List<Integral> getAll();
    //删除
    int delect(@Param("commodityId") int commodityId);
    //添加
    int add(Integral integral);
    //修改
    int update(Integral integral);
    Integral getidAll(@Param("commodityId") int commodityId);
    //修改状态
    int updatezt(Integral integral);
}