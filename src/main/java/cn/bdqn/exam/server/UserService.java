package cn.bdqn.exam.server;

import cn.bdqn.exam.po.Dept;
import cn.bdqn.exam.po.User;

import java.util.List;


public interface UserService {
   /*
     查询
   */
   List<User> getAll();
   /*
     删除
   */
   int del(int id);
   /*
     增加
   */
   int add(User user);
   /*
      查询全部部门
    */
   List<Dept> getALL();
}

