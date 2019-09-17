package cn.bdqn.exam.dao;



import java.util.List;


import cn.bdqn.exam.po.Video;
import cn.bdqn.exam.po.VideoExample;


import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
   List<Video> getAll();
}