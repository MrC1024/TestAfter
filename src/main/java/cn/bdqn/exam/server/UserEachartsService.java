package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.User;

import java.util.List;

public interface UserEachartsService {
    /**
     * 图表获取数据
     */
    public List<User> finduserEacharts();
}
