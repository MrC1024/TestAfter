package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Banner;
import cn.bdqn.exam.entity.BannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerMapper {
    int countByExample(BannerExample example);

    int deleteByExample(BannerExample example);

    int deleteByPrimaryKey(Integer banid);

    int insert(Banner record);

    int insertSelective(Banner record);

    List<Banner> selectByExample(BannerExample example);

    Banner selectByPrimaryKey(Integer banid);

    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}