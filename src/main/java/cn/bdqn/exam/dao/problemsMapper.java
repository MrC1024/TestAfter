package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Problems;
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
}
