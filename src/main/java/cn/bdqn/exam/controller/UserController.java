package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.server.UserService;
import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;
import static java.lang.System.setOut;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "getAll",produces="application/json;charset=UTF-8")
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

    @RequestMapping(value = "/getBuMen",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getBuMen(HttpServletRequest request){
        List<Dept> list = userService.getALL();
        request.setAttribute("list","list");
        return JSON.toJSONString(list);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(User user,HttpServletRequest request){
        int res = userService.add(user);
        return JSON.toJSONString(res);
    }



    @RequestMapping("change-password/{id}")
    public String a(HttpServletRequest request, @PathVariable("id")int id,Model model){
        request.setAttribute("id",id);
        User user=userService.getById(id);
        model.addAttribute("us",user);
        return "change-password.html";
    }


    @RequestMapping("member-show/{id}")
    public String membershow(HttpServletRequest request, @PathVariable("id")int id,Model model){
        request.setAttribute("id",id);
        User user=userService.getById(id);
        model.addAttribute("us",user);
        return "member-show.html";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(User user,HttpServletRequest request){
        String newpassword = request.getParameter("newpassword");
        out.println(newpassword);
        user.setPassword(newpassword);
        out.println(user.getPassword());
        int res = userService.upd(user);
        out.println(res);
        return  JSON.toJSONString(res);
    }

    @RequestMapping("/del2")
    @ResponseBody
    public void del2(HttpServletRequest request){
        String items = request.getParameter("delitems");// System.out.println(items);
        System.out.println(items);
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int b = Integer.parseInt(strs[i]);
                System.out.println(b);
                userService.del(b);
            } catch (Exception e) {
            }
        }
        System.out.println(1);
    }

}
