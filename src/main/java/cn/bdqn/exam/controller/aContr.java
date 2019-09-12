package cn.bdqn.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aContr {
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index.html";
    }
    @RequestMapping("/welcome.html")
    public String welcome(){
        return "welcome.html";
    }

    @RequestMapping("/Banner.html")
    public String banner(){
        return "Banner.html";
    }
}
