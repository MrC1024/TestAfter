package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.User;

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

   /*
      Id查询
    */
   User getById(int id);
   /*
     修改密码
   */
   int upd(User user);


}

