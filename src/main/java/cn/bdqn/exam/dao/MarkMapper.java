package cn.bdqn.exam.dao;


import cn.bdqn.exam.po.Mark;
import cn.bdqn.exam.po.MarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarkMapper {
    int countByExample(MarkExample example);

    int deleteByExample(MarkExample example);

    int deleteByPrimaryKey(Integer markid);

    int insert(Mark record);

    int insertSelective(Mark record);

    List<Mark> selectByExample(MarkExample example);

    Mark selectByPrimaryKey(Integer markid);

    int updateByExampleSelective(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByExample(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByPrimaryKeySelective(Mark record);

    int updateByPrimaryKey(Mark record);
}