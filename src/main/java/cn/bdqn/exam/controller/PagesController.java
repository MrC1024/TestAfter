package cn.bdqn.exam.controller;

import cn.bdqn.exam.server.PageService;
import cn.bdqn.exam.util.Pages;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("Test1")
public class PagesController {

    @Autowired
    PageService pageService;

    @RequestMapping(value="/getPage",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getPage(HttpServletRequest request){
        Integer index = Integer.parseInt(request.getParameter("index"));
        Pages page = new Pages();
        page.setCount(pageService.count());
        page.setContent(pageService.getPage((index-1)*page.getPageCount(), page.getPageCount()));
        return JSON.toJSONString(page);
    }

    @RequestMapping("/getCount")
    @ResponseBody
    public String getCount(){
        int count = pageService.count();
        return JSON.toJSONString(count);
    }
}
