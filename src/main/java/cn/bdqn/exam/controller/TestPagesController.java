package cn.bdqn.exam.controller;

import cn.bdqn.exam.server.TestPagesService;
import cn.bdqn.exam.util.TestPages;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("Test2")
public class TestPagesController {

    @Autowired
    TestPagesService testPagesService;

    @RequestMapping(value = "/getPages",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getPages(HttpServletRequest request){
        Integer index = Integer.parseInt(request.getParameter("index"));
        TestPages tp = new TestPages();
        tp.setCount(testPagesService.counts());
        tp.setContent(testPagesService.getPages((index-1)* tp.getPageCount(),tp.getPageCount()));
        return JSON.toJSONString(tp);
    }

    @RequestMapping("/getCounts")
    @ResponseBody
    public String getCounts(){
        int counts = testPagesService.counts();
        return JSON.toJSONString(counts);
    }
}
