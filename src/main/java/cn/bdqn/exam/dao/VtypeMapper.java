package cn.bdqn.exam.dao;

import com.bangbang.po.Vtype;
import com.bangbang.po.VtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VtypeMapper {
    int countByExample(VtypeExample example);

    int deleteByExample(VtypeExample example);

    int deleteByPrimaryKey(Integer vtypeid);

    int insert(Vtype record);

    int insertSelective(Vtype record);

    List<Vtype> selectByExample(VtypeExample example);

    Vtype selectByPrimaryKey(Integer vtypeid);

    int updateByExampleSelective(@Param("record") Vtype record, @Param("example") VtypeExample example);

    int updateByExample(@Param("record") Vtype record, @Param("example") VtypeExample example);

    int updateByPrimaryKeySelective(Vtype record);

    int updateByPrimaryKey(Vtype record);
}