package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.userEachartsMapper;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.server.UserEachartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserEachartsService")
public class UserEachartsServiceImpl implements UserEachartsService {
    @Autowired
    userEachartsMapper userEachartsMapper;
    public List<User> finduserEacharts() {
        return userEachartsMapper.finduserEacharts();
    }
}
