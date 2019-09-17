package cn.bdqn.exam.server;

import cn.bdqn.exam.po.Dept;
import cn.bdqn.exam.po.User;
import cn.bdqn.exam.po.Video;

import java.util.List;


public interface VideoService {
   /*
     查询
   */
   List<Video> getAll();

}

