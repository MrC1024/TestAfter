package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.MarkMapper;
import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Mark;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.entity.testpaperstep;
import cn.bdqn.exam.server.MarkService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkServiceoImpl implements MarkService {
    @Autowired
    private MarkMapper markMapper;

    public List<Mark> getAll() {
        return markMapper.getAll();
    }
    public int delect(int markid) {
        return markMapper.delect(markid);
    }

    public int add(Mark mism) {
        return markMapper.add(mism);
    }

    public int update(Mark mism) {
        return markMapper.update(mism);
    }

    public Mark getidAll(int markid) {
        return markMapper.getidAll(markid);
    }

    public List<Dept> deptAll() {
        return markMapper.deptAll();
    }

    public List<User> userAll() {
        return markMapper.userAll();
    }

    public List<testpaperstep> testpaperstepAll() {
        return markMapper.testpaperstepAll();
    }
}
