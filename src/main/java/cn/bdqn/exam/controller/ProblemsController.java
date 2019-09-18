package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Problems;
import cn.bdqn.exam.server.ProblemsService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/problems")
@Controller
public class ProblemsController {
    @Autowired
    ProblemsService problemsService;
    @RequestMapping("/finaByProblems")
    @ResponseBody
    public String finaByProblems(){
        List<Problems> problems=problemsService.finaByproblems();
        return JSON.toJSONString(problems);
    }
}
