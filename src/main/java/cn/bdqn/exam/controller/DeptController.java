package cn.bdqn.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }
}
