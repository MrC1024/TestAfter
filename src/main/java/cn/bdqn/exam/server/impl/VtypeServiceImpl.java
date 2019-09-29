package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.VtypeMapper;
import cn.bdqn.exam.entity.Vtype;
import cn.bdqn.exam.server.VtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VtypeServiceImpl implements VtypeService
{
    @Autowired
    private VtypeMapper curriculumMapper;


    public List<Vtype> getAll() {
        return curriculumMapper.getAll();
    }

    public int add(Vtype curriculum) {
        return curriculumMapper.add(curriculum);
    }

    public int upd(Vtype curriculum) {
        return curriculumMapper.upd(curriculum);
    }

    public int del(int ifSel) {
        return curriculumMapper.del(ifSel);
    }


    public Vtype idSel(int id) {
        return curriculumMapper.idSel(id);
    }

    @Override
    public int videoCount(String curriculumName) {
        return curriculumMapper.videoCount(curriculumName);
    }
}
