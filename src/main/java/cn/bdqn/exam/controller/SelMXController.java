package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Banner;
import cn.bdqn.exam.entity.SelMX;
import cn.bdqn.exam.server.impl.SelMXServiceImpl;
import cn.bdqn.exam.util.Page1;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/SelMXController")
public class SelMXController {
    @Autowired
    private SelMXServiceImpl selMXService;

    @RequestMapping(value = "/getAll",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAll(){
        List<SelMX> list = selMXService.getAll();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/del")
    @ResponseBody
    public String del(HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        int res = selMXService.del(id);
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
                int a = Integer.parseInt(strs[i]);
                System.out.println(a);
                selMXService.del(a);
            } catch (Exception e) {
            }
        }
    }

    @RequestMapping("/getCount")
    @ResponseBody
    public String getCount(){
        int count = selMXService.count();
        System.out.println("/getCount."+count);
        return JSON.toJSONString(count);
    }

    @RequestMapping(value = "/getPage",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getPage(HttpServletRequest request){
        Integer index = Integer.parseInt(request.getParameter("index"));  //获取当前页数
        System.out.println("11111111当前页数"+index);
//        Integer count =  Integer.parseInt(request.getParameter("count"));   //获取总条数
//        System.out.println(count);
        Page1 page = new Page1();
        page.setCount(selMXService.count());
        System.out.println("总数"+index);
        page.setContent(selMXService.getPage((index-1)*page.getPageCount(), page.getPageCount()));
        return JSON.toJSONString(page);
    }

    @RequestMapping(value = "/cha",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String byban(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println(name);
        if(name==""||name==null){
            return "admin-list";
        }
        List<SelMX> list=selMXService.cha(name);
        System.out.println(list.size());
        return JSON.toJSONString(list);
    }

}
