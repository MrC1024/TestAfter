package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Role;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.entity.Yonghu;
import cn.bdqn.exam.server.YonghuService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static java.lang.System.out;
@Controller
@RequestMapping("/yonghu")
public class yonghuController {
    @Autowired
    YonghuService yonghuService;

    @RequestMapping(value = "getAll",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAll(){
        List<Yonghu> list = yonghuService.getAll();
        return JSON.toJSONString(list);
    }

    @RequestMapping("del/{id}")
    @ResponseBody
    public String del(@PathVariable("id") Integer id, HttpServletRequest request){
        int res =  yonghuService.del(id);
        return JSON.toJSONString(res);
    }

   @RequestMapping("/getJiaose")
    @ResponseBody
    public String getBuMen(HttpServletRequest request){
        List<Role> list = yonghuService.getJiaose();
        request.setAttribute("list","list");
        return JSON.toJSONString(list);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(Yonghu yonghu,HttpServletRequest request){
        int res = yonghuService.add(yonghu);
        return JSON.toJSONString(res);
    }

    @RequestMapping(value = "member-show/{id}",produces="application/json;charset=UTF-8")
    public String membershow(HttpServletRequest request, @PathVariable("id")int id,Model model){
        request.setAttribute("id",id);
        Yonghu yonghu=yonghuService.getById(id);
        model.addAttribute("yh",yonghu);
        return "member-show.html";
    }

 /*   @RequestMapping("change-password/{id}")
    public String a(HttpServletRequest request, @PathVariable("id")int id, Model model){
        request.setAttribute("id",id);
        User user=yonghuService.getById(id);
        model.addAttribute("us",user);
        return "change-password.html";
    }*/


   /* @RequestMapping("member-show/{id}")
    public String membershow(HttpServletRequest request, @PathVariable("id")int id,Model model){
        request.setAttribute("id",id);
        User user=yonghuService.getById(id);
        model.addAttribute("us",user);
        return "member-show.html";
    }*/

    /*@RequestMapping("/update")
    @ResponseBody
    public String update(User user,HttpServletRequest request){
        String newpassword = request.getParameter("newpassword");
        user.setPassword(newpassword);
        int res = yonghuService.upd(user);
        return  JSON.toJSONString(res);
    }*/

    @RequestMapping("/del2")
    @ResponseBody
    public void del2(HttpServletRequest request){
        String items = request.getParameter("delitems");// System.out.println(items);
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int b = Integer.parseInt(strs[i]);
                yonghuService.del(b);
            } catch (Exception e) {
            }
        }
    }


}
