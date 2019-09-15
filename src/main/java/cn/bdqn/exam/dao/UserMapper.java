package cn.bdqn.exam.dao;



import java.util.List;


import cn.bdqn.exam.po.Dept;
import cn.bdqn.exam.po.User;


public interface UserMapper {
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
      修改密码
    */
   int upd(User user);
   /*
      Id查询
    */
   User getById(int id);
   /*
      查询全部部门
    */
   List<Dept> getALL();
}