package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.testpaper;
import cn.bdqn.exam.entity.testpaperstep;
import cn.bdqn.exam.server.TestPaperService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("Test")
public class TestPaperController {

    @Autowired
    TestPaperService testPaperService;

    @RequestMapping(value = "/getAll1",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAll1(){
        List<testpaper> list = testPaperService.getAll1();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/getStepAll")
    @ResponseBody
    public String getStepAll(){
        List<testpaperstep> list = testPaperService.getStepAll();
        return JSON.toJSONString(list);
    }
    @RequestMapping("/testAdd")
    @ResponseBody
    public String testAdd(testpaper test){
        int res = testPaperService.testAdd(test);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/testDel/{tid}")
    @ResponseBody
    public String testDel(@PathVariable("tid") Integer tid){
            int res = testPaperService.testDel(tid);
            return JSON.toJSONString(res);

    }

    @RequestMapping("/testUpdId/{tid}")
    @ResponseBody
    public String testUpdId(@PathVariable("tid") Integer tid){
        testpaper t = testPaperService.testUpdId(tid);
        return JSON.toJSONString(t);
    }

    @RequestMapping("/testUpd")
    @ResponseBody
    public String testUpd(testpaper test){
        int res = testPaperService.testUpd(test);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/del2")
    @ResponseBody
    public void del2(HttpServletRequest request){
        String items = request.getParameter("delitems");
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int a = Integer.parseInt(strs[i]);
                testPaperService.testDel(a);
            } catch (Exception e) {
            }
        }
    }

    @ResponseBody
    @RequestMapping("/mohucha/{tName}")
    public String mohucha(@PathVariable String tName){
        List<testpaper> list = testPaperService.mohucha(tName);
        return JSON.toJSONString(list);
    }
}
