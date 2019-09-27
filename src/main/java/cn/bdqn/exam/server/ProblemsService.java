package cn.bdqn.exam.server;

import cn.bdqn.exam.entity.Problems;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProblemsService {
    /**
     * 问题反馈查询
     *
     * @return
     */
    List<Problems> finaByproblems();
    /**
     * 问题反馈回复
     * @param problems
     * @return
     */
    int upd(Problems problems);
    /**
     * 问题反馈模糊查
     * @return
     */
    List<Problems> finaByProQuery(String pro_question);
    /**
     * 问题反馈删除
     */
    int del(int pro_id);

}
