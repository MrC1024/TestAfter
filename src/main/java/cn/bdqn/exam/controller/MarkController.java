package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Mark;
import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.server.MarkService;
import cn.bdqn.exam.entity.testpaperstep;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Mark")
public class MarkController {
          @Autowired
          private MarkService markService;
            @ResponseBody
            @RequestMapping(value = "/getAll",produces="application/json;charset=UTF-8")
            public String selectByExample(){
                 List<Mark> list = markService.getAll();
                 return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping(value = "/deptAll",produces="application/json;charset=UTF-8")
            public String deptAll(){
                List<Dept> list = markService.deptAll();
                return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping(value = "/userAll",produces="application/json;charset=UTF-8")
            public String userAll(){
                List<User> list = markService.userAll();
                return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping(value = "/testpaperstepAll",produces="application/json;charset=UTF-8")
            public String testpaperstepAll(){
                List<testpaperstep> list = markService.testpaperstepAll();
                return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping(value = "/getidAll/{markid}",produces="application/json;charset=UTF-8")
            public String testpaperstepAll(@PathVariable("markid") Integer markid){
                Mark list = markService.getidAll(markid);
                return JSON.toJSONString(list);
            }
        @ResponseBody
        @RequestMapping("/update")
        public String update(Mark mark){
            int res = markService.update(mark);
            return JSON.toJSONString(res);
        }
}
