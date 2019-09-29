package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Author;
import cn.bdqn.exam.entity.Yonghu;
import cn.bdqn.exam.server.AuthorService;
import cn.bdqn.exam.server.YonghuService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @RequestMapping(value = "getAll",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAll(){
        List<Author> list = authorService.getAll();
        return JSON.toJSONString(list);
    }

    @RequestMapping("del/{id}")
    @ResponseBody
    public String del(@PathVariable("id") Integer id, HttpServletRequest request){
        int res =  authorService.del(id);
        return JSON.toJSONString(res);
    }

    @RequestMapping(value = "member-show/{id}",produces="application/json;charset=UTF-8")
    public String membershow(HttpServletRequest request, @PathVariable("id")int id, Model model){
        request.setAttribute("id",id);
        Author author=authorService.getById(id);
        model.addAttribute("yh",author);
        return "member-show.html";
    }
    @RequestMapping("/add")
    @ResponseBody
    public String add(Author author,HttpServletRequest request){
        int res = authorService.add(author);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/del2")
    @ResponseBody
    public void deptDel2(HttpServletRequest request){
        String items = request.getParameter("delitems");
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int a = Integer.parseInt(strs[i]);
                authorService.del(a);
            } catch (Exception e) {
            }
        }
    }

}
