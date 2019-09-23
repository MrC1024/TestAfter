package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Problems;
import cn.bdqn.exam.server.ProblemsService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/problems")
@Controller
public class ProblemsController {
    @Autowired
    ProblemsService problemsService;
    @RequestMapping(value = "/finaByProblems",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String finaByProblems(){
        List<Problems> problems=problemsService.finaByproblems();
        return JSON.toJSONString(problems);
    }
    @ResponseBody
    @RequestMapping("/upd")
    public String  upd( HttpServletRequest request){
        Integer pro_id= Integer.parseInt(request.getParameter("pro_id"));
        String proAdminContext=request.getParameter("proAdminContext");
        Problems problems=new Problems();
        problems.setPro_id(pro_id);
        problems.setProAdminContext(proAdminContext);
        int res=problemsService.upd(problems);
        return JSON.toJSONString(res);
    }
    @ResponseBody
    @RequestMapping(value = "/finaByProQuery",produces="application/json;charset=UTF-8")
    public String finaByProQuery(HttpServletRequest request){
        String pro_question=request.getParameter("pro_question");
        System.out.println(pro_question);
        List<Problems> finaByProQuerys=problemsService.finaByProQuery(pro_question);
        return JSON.toJSONString(finaByProQuerys);
    }
}
