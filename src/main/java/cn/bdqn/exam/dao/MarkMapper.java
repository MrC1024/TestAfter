package cn.bdqn.exam.dao;

import com.bangbang.po.Mark;
import com.bangbang.po.MarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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