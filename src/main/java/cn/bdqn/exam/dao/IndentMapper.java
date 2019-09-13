package cn.bdqn.exam.dao;

import com.bangbang.po.Indent;
import com.bangbang.po.IndentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndentMapper {
    int countByExample(IndentExample example);

    int deleteByExample(IndentExample example);

    int deleteByPrimaryKey(Integer indentid);

    int insert(Indent record);

    int insertSelective(Indent record);

    List<Indent> selectByExample(IndentExample example);

    Indent selectByPrimaryKey(Integer indentid);

    int updateByExampleSelective(@Param("record") Indent record, @Param("example") IndentExample example);

    int updateByExample(@Param("record") Indent record, @Param("example") IndentExample example);

    int updateByPrimaryKeySelective(Indent record);

    int updateByPrimaryKey(Indent record);
}