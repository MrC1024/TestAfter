package cn.bdqn.exam.controller;
import cn.bdqn.exam.entity.Comment;
import cn.bdqn.exam.server.CommentService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 问题反馈控制层
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;
    @RequestMapping("/findByComment")
    @ResponseBody
    public  String  findByComment() {
        List<Comment> list = commentService.findByComment();
        return JSON.toJSONString(list);
    }
    @RequestMapping("/updByComment/{commentid}/{commentAdmin}")
    public String  updByComment(Integer commentid,String commentAdmin){
        int res=commentService.updByComment(commentid,commentAdmin);
        return JSON.toJSONString(res);
    }
}
