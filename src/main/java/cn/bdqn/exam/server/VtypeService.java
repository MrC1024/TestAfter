package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Vtype;

import java.util.List;

public interface VtypeService {
    List<Vtype> getAll();
    int add(Vtype curriculum);
    int upd(Vtype curriculum);
    int del(int ifSel);
    Vtype idSel(int id);
}
