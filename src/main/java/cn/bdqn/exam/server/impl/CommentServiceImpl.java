package cn.bdqn.exam.server.impl;
import cn.bdqn.exam.dao.commentMapper;
import cn.bdqn.exam.entity.Comment;
import cn.bdqn.exam.server.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * 问题反馈
 */
@Service("CommentSerivce")
public class CommentServiceImpl implements CommentService {
    @Autowired
    commentMapper comments;

    /**
     * 问题反馈查询
     * @return
     */
    public List<Comment> findByComment() {
        return comments.findByComment();
    }

    /**
     * 问题反馈回复
     * @param commentAdmin
     * @param commentid
     * @return
     */
    public int updByComment(int commentid,String commentAdmin) {
        return comments.updByComment(commentid,commentAdmin);
    }
}
