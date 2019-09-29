package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Problems;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 *问题反馈
 */
@MapperScan
@Repository
public interface problemsMapper {
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
    List<Problems> finaByProQuery(@Param("pro_question")String pro_question);
    /**
     * 问题反馈删除
     */
    int del(@Param("pro_id") int pro_id);

}
