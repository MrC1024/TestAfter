package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.DeptMapper;
import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.server.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;


    @Override
    public List<Dept> getAll() {
        return deptMapper.getAll();
    }

    @Override
    public int getAdd(Dept dept) {
        return deptMapper.getAdd(dept);
    }

    @Override
    public int del(int deptid) {
        return deptMapper.del(deptid);
    }

    @Override
    public Dept updId(int deptid) {
        return deptMapper.updId(deptid);
    }

    @Override
    public int upd(Dept dept) {
        return deptMapper.upd(dept);
    }
}
