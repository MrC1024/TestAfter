package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.UserMapper;
import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User Login(String account, String password) {
        return userMapper.Login(account,password);
    }

    public List<User> getAll() {
        return userMapper.getAll();
    }

    public int del(int id) {
        return userMapper.del(id);
    }

    public int add(User user) {
        return userMapper.add(user);
    }

    public List<Dept> getALL() {
        return userMapper.getALL();
    }

    public User getById(int id) {
        return userMapper.getById(id);
    }

    public int upd(User user) {
        return userMapper.upd(user);
    }


}
