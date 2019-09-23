package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.SelMXMapper;
import cn.bdqn.exam.entity.SelMX;
import cn.bdqn.exam.server.SelMXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelMXServiceImpl implements SelMXService {
    @Autowired
    private SelMXMapper selMXMapper;
    public List<SelMX> getAll() {
        return selMXMapper.getAll();
    }

    public int del(int ifSel) {
        return selMXMapper.del(ifSel);
    }

    public int count() {
        return selMXMapper.count();
    }

    public List<SelMX> getPage(Integer num1, Integer num2) {
        return selMXMapper.getPage(num1,num2);
    }

    public List<SelMX> cha(String name) {
        return selMXMapper.cha(name);
    }

}
