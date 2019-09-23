package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface NoticeService {
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
