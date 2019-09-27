package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Role;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.entity.Yonghu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YonghuMapper {
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
