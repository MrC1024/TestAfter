package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.YonghuMapper;
import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Role;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.entity.Yonghu;
import cn.bdqn.exam.server.YonghuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service
@RequestMapping("/yonghu")
public class YonghuServiceImpl implements YonghuService {

    @Autowired
    YonghuMapper yonghuMapper;

    public List<Yonghu> getAll() {
        return yonghuMapper.getAll();
    }

    public int del(int id) {
        return yonghuMapper.del(id);
    }

    public int add(Yonghu yonghu) {
        return yonghuMapper.add(yonghu);
    }

    public Yonghu getById(int id) {
        return yonghuMapper.getById(id);
    }

    public List<Role> getJiaose() {
        return yonghuMapper.getJiaose();
    }
}
