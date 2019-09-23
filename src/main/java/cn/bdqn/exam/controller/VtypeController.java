package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Vtype;
import cn.bdqn.exam.server.impl.VtypeServiceImpl;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/CurriculumController")
public class VtypeController {
    @Autowired
    private VtypeServiceImpl curriculumService;

    @RequestMapping("/toPC")
    public String toPC(){
        System.out.println("1111");
        return "product-category.html";
    }

    @RequestMapping(value = "/getAll",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAll(){
        List<Vtype> list = curriculumService.getAll();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(HttpServletRequest request){
        String name = request.getParameter("name");
        Vtype vtype= new Vtype();
        vtype.setCurriculumName(name);
        int res = curriculumService.add(vtype);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/upd")
    @ResponseBody
    public String upd(HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Vtype vtype = new Vtype();
        vtype.setCurriculumId(id);
        vtype.setCurriculumName(name);
        int res = curriculumService.upd(vtype);
        System.out.println(res);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/idSel")
    @ResponseBody
    public String idSel(HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        Vtype vtype = curriculumService.idSel(id);
        return JSON.toJSONString(vtype);
    }

    @RequestMapping("/del")
    @ResponseBody
    public String del(HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        int res = curriculumService.del(id);
        return JSON.toJSONString(res);
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
                curriculumService.del(b);
            } catch (Exception e) {
            }
        }
//        Integer id = Integer.parseInt(request.getParameter("id"));
//        int res = bannerService.del(id);
//        return JSON.toJSONString(res);
        System.out.println(1);
    }






}
