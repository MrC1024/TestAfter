package cn.bdqn.exam.server;


import cn.bdqn.exam.entity.Comment;

import java.util.List;

/**
 * 问题反馈
 */
public interface CommentService {
    /**
     * 问题反馈查询
     * @return
     */
    List<Comment> findByComment();
    /**
     * 问题反馈回复
     */
    int updByComment(int commentid,String commentAdmin);

}
