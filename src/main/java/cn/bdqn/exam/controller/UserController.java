package cn.bdqn.exam.controller;

import cn.bdqn.exam.po.Dept;
import cn.bdqn.exam.po.User;
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
import java.util.List;

import static java.lang.System.out;
import static java.lang.System.setOut;

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

    @RequestMapping("/add")
    @ResponseBody
    public String add(User user,HttpServletRequest request){
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        out.println(deptid);
        int points = Integer.parseInt(request.getParameter("points"));
        String username = request.getParameter("username");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        user.setUsername(username);
        user.setPassword(password);
        user.setAccount(account);
        user.setSex(sex);
        user.setDeptid(deptid);
        user.setPoints(points);
        int res = userService.add(user);
        return JSON.toJSONString(res);
    }
   /* @RequestMapping("change-password/{id}")
    public String changepassword1(@PathVariable("id") int id, Model model){
        model.addAttribute("id",id);
        return "change-password";
    }*/

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

}
