package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.TestPaperMapper;
import cn.bdqn.exam.entity.testpaper;
import cn.bdqn.exam.entity.testpaperstep;
import cn.bdqn.exam.server.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestPaperServiceImpl implements TestPaperService {

    @Autowired
    TestPaperMapper testPaperMapper;

    public List<testpaper> getAll1() {
        return testPaperMapper.getAll1();
    }

    public int testAdd(testpaper test) {
        return testPaperMapper.testAdd(test);
    }

    public List<testpaperstep> getStepAll() {
        return testPaperMapper.getStepAll();
    }

    public int testDel(int tid) {
        return testPaperMapper.testDel(tid);
    }

    public testpaper testUpdId(Integer tid) {
        return testPaperMapper.testUpdId(tid);
    }

    public int testUpd(testpaper test) {
        return testPaperMapper.testUpd(test);
    }

    public List<testpaper> mohucha(String tName) {
        return testPaperMapper.mohucha(tName);
    }

}
