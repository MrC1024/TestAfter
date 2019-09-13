package cn.bdqn.exam.dao;

import com.bangbang.po.Badanswer;
import com.bangbang.po.BadanswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BadanswerMapper {
    int countByExample(BadanswerExample example);

    int deleteByExample(BadanswerExample example);

    int deleteByPrimaryKey(Integer badid);

    int insert(Badanswer record);

    int insertSelective(Badanswer record);

    List<Badanswer> selectByExample(BadanswerExample example);

    Badanswer selectByPrimaryKey(Integer badid);

    int updateByExampleSelective(@Param("record") Badanswer record, @Param("example") BadanswerExample example);

    int updateByExample(@Param("record") Badanswer record, @Param("example") BadanswerExample example);

    int updateByPrimaryKeySelective(Badanswer record);

    int updateByPrimaryKey(Badanswer record);
}