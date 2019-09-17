package cn.bdqn.exam.dao;


import cn.bdqn.exam.entity.Comment;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 问题反馈
 */
@MapperScan
@Repository
public interface commentMapper {
    /**
     * 问题反馈查询
     *
     * @return
     */
   List<Comment> findByComment();
    /**
     * 问题反馈回复
     */
    int updByComment(@Param("commentid") int commentid,@Param("commentAdmin") String commentAdmin );
}