package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Video;
import cn.bdqn.exam.entity.Vtype;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface VideoService {
    /*
  查询
   */
    List<Video> getAll();

    /*
  增加
   */
    int add(Video video);
    /*
     删除
   */
    int del(int id);
    /*
     查询全部部门
   */
    List<Vtype> getALL();
    /*
  条件查
   */
    List<Video> getById(int id);
    /*
    上传需要
     */
    Map<String,String> savaVideo(@RequestParam("file") MultipartFile file);
}
