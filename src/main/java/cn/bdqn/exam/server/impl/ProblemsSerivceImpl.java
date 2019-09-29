package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.problemsMapper;
import cn.bdqn.exam.entity.Problems;
import cn.bdqn.exam.server.ProblemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProblemsSerivce")
public class ProblemsSerivceImpl  implements ProblemsService {
    @Autowired
    problemsMapper problemsMapper;
    public List<Problems> finaByproblems() {
        return problemsMapper.finaByproblems();
    }

    public int upd(Problems problems) {
        return problemsMapper.upd(problems);
    }

    public List<Problems> finaByProQuery(String pro_question) {
        return problemsMapper.finaByProQuery(pro_question);
    }

    @Override
    public int del(int pro_id) {
        return problemsMapper.del(pro_id);
    }
}
