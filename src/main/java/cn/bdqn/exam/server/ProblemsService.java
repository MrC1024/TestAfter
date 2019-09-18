package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Problems;

import java.util.List;

public interface ProblemsService {
    /**
     * 问题反馈查询
     *
     * @return
     */
    List<Problems> finaByproblems();
}
