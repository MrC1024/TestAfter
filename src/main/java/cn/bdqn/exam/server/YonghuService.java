package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Role;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.entity.Yonghu;

import java.util.List;

public interface YonghuService {
    /*
  查询
*/
    List<Yonghu> getAll();

    /*
       删除
     */
    int del(int id);
    /*
       增加
     */
    int add(Yonghu yonghu);
    /*
      Id查询
    */
    Yonghu getById(int id);

    /*
 查询全部角色
*/
    List<Role> getJiaose();
}
