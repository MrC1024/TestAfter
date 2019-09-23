package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.TestPagesMapper;
import cn.bdqn.exam.entity.testpaper;
import cn.bdqn.exam.server.TestPagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestPagesServiceImpl implements TestPagesService {

    @Autowired
    TestPagesMapper testPagesMapper;

    public List<testpaper> getPages(Integer num1, Integer num2) {
        return testPagesMapper.getPages(num1,num2);
    }

    public int counts() {
        return testPagesMapper.counts();
    }


}
