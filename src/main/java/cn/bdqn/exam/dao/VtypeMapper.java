package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Vtype;

import java.util.List;

public interface VtypeMapper {
    List<Vtype> getAll();
    int add(Vtype curriculum);
    int upd(Vtype curriculum);
    int del(int ifSel);
    Vtype idSel(int id);
    int videoCount(String curriculumName);  //查询视频存在    如果不存在执行删除，反之不能删除
}
