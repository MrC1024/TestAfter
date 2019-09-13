package cn.bdqn.exam.dao;

import com.bangbang.po.Becommented;
import com.bangbang.po.BecommentedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BecommentedMapper {
    int countByExample(BecommentedExample example);

    int deleteByExample(BecommentedExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Becommented record);

    int insertSelective(Becommented record);

    List<Becommented> selectByExample(BecommentedExample example);

    Becommented selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Becommented record, @Param("example") BecommentedExample example);

    int updateByExample(@Param("record") Becommented record, @Param("example") BecommentedExample example);

    int updateByPrimaryKeySelective(Becommented record);

    int updateByPrimaryKey(Becommented record);
}