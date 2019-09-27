package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Author;
import cn.bdqn.exam.entity.Role;
import cn.bdqn.exam.entity.Yonghu;

import java.util.List;

public interface AuthorMapper {
            /*
          查询
        */
    List<Author> getAll();
    /*
       删除
     */
    int del(int id);
    /*
       增加
     */
    int add(Author author);
    /*
     Id查询
   */
    Author getById(int id);

}
