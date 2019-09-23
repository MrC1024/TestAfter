package cn.bdqn.exam.server.impl;


import cn.bdqn.exam.dao.PageMapper;
import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.server.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    PageMapper pageMapper;


    @Override
    public List<Dept> getPage(Integer num1, Integer num2) {
        return pageMapper.getPage(num1,num2);
    }

    @Override
    public int count() {
        return pageMapper.count();
    }
}
