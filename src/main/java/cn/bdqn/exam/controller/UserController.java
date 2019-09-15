package cn.bdqn.exam.controller;

import cn.bdqn.exam.po.Dept;
import cn.bdqn.exam.po.User;
import cn.bdqn.exam.server.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getAll")
    @ResponseBody
    public String getAll(){
        List<User> list = userService.getAll();
        return JSON.toJSONString(list);
    }

    @RequestMapping("del/{id}")
    @ResponseBody
    public String del(@PathVariable("id") Integer id, HttpServletRequest request){
        int res =  userService.del(id);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/getBuMen")
    @ResponseBody
    public String getBuMen(HttpServletRequest request){
        List<Dept> list = userService.getALL();
        request.setAttribute("list","list");
        return JSON.toJSONString(list);
    }
}
