package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Integral;
import cn.bdqn.exam.dao.*;
import cn.bdqn.exam.server.IntegralService;
import cn.bdqn.exam.server.MarkService;
import cn.bdqn.exam.server.impl.IntegralServiceImpl;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/Integral")
public class IntegralController {
          @Autowired
          private IntegralServiceImpl integralService;
            @ResponseBody
            @RequestMapping(value ="/getAll",produces="application/json;charset=UTF-8")
            public String selectByExample(){
                 List<Integral> list = integralService.getAll();
                 return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping("/delect/{commodityId}")
            public  String delect(@PathVariable("commodityId") Integer commodityId){
                int res = integralService.delect(commodityId);
                return JSON.toJSONString(res);
            }
            @ResponseBody
            @RequestMapping("/add")
            public  String add(Integral integral, HttpServletRequest request){
                int res =integralService.add(integral);
                return JSON.toJSONString(res);
            }
            @ResponseBody
            @PostMapping("/getidAll/{commodityId}")
            public  String getidAll(@PathVariable("commodityId") Integer commodityId){
                Integral list = integralService.getidAll(commodityId);
                return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping("/update")
            public  String update(Integral integral){
                int res = integralService.update(integral);
                return  JSON.toJSONString(res);
            }
            @ResponseBody
            @RequestMapping("/upda1")
            public  String upda1(Integral integral){
                int res = integralService.updatezt(integral);
                return  JSON.toJSONString(res);
            }
            @ResponseBody
            @RequestMapping("/upda2")
            public  String upda2(Integral integral){
                int res = integralService.updatezt(integral);
                System.out.print(res);
                return  JSON.toJSONString(res);
            }


        @RequestMapping("/del2")
        @ResponseBody
        public void del2(HttpServletRequest request) {
            String items = request.getParameter("delitems");
            String[] strs = items.split(",");
            for (int i = 0; i < strs.length; i++) {
                try {
                    int a = Integer.parseInt(strs[i]);
                    integralService.delect(a);
                } catch (Exception e) {
                }
            }
        }
}
