package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.TestMapper;
import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Test;
import cn.bdqn.exam.server.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testPaperMapper;

    public List<Test> getAll() {
        return testPaperMapper.getAll();
    }

    public int delById(Integer id) {
        return testPaperMapper.delById(id);
    }

    public int updTestStatus(Integer id) {
        return testPaperMapper.updTestStatus(id);
    }

    public List<Test> QueryTestNameByLike(String testname) {
        return testPaperMapper.QueryTestNameByLike(testname);
    }

    public List<Dept> QueryDeptAll() {
        return testPaperMapper.QueryDeptAll();
    }

    public int addTest(Test test) {
        return testPaperMapper.addTest(test);
    }

    public Test QueryTestById(Integer id) {
        return testPaperMapper.QueryTestById(id);
    }

    public Integer testCount() {
        return testPaperMapper.testCount();
    }

    @Override
    public int updTest(Test test) {
        return testPaperMapper.updTest(test);
    }
}
