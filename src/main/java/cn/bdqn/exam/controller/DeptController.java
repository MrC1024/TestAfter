package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.server.DeptService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("Dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/getAll",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAll(){
        List<Dept> list = deptService.getAll();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/getAdd")
    @ResponseBody
    public String getAdd(Dept dept){
        int res = deptService.getAdd(dept);
           return JSON.toJSONString(res);
    }

    @RequestMapping("/del/{deptid}")
    @ResponseBody
    public String del(@PathVariable("deptid") int deptid){
        int res = deptService.del(deptid);
        return JSON.toJSONString(res);
    }

    @RequestMapping(value = "/updId/{deptid}",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String updId(@PathVariable("deptid") Integer deptid){
        Dept d = deptService.updId(deptid);
        return JSON.toJSONString(d);
    }

    @RequestMapping("/upd")
    @ResponseBody
    public  String upd(Dept dept){
        int res = deptService.upd(dept);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/deptDel2")
    @ResponseBody
    public void deptDel2(HttpServletRequest request){
        String items = request.getParameter("delitems");
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int a = Integer.parseInt(strs[i]);
                deptService.del(a);
            } catch (Exception e) {
            }
        }
    }
}
