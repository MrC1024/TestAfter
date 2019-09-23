package cn.bdqn.exam.controller;


import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.server.UserEachartsService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userEachertsController")
public class UserEachertsController {
    @Autowired
    UserEachartsService userEachartsService;
    @ResponseBody
    @RequestMapping(value = "/finduserEacherts",produces="application/json;charset=UTF-8")
    public String findUserEacherts(){
        List<User> list=userEachartsService.finduserEacharts();
    return JSON.toJSONString(list);
    }

}
