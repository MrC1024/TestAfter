package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Author;

import java.util.List;

public interface AuthorService {
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
    /*
       是否有课程
    */
    int videoCount(String name);
}
