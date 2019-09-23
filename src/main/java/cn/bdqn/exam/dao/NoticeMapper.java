package cn.bdqn.exam.dao;


import java.util.List;


import cn.bdqn.exam.entity.Notice;
import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
    //公告
    List<Notice> selectByExample();
    //查全部
    List<Notice> getAll();
    //删除
    int delect(@Param("noticeid") int noticeid);
    //添加
    int add(Notice mism);
    //修改
    int update(Notice mism);
    Notice getidAll(@Param("noticeid") int noticeid);

}