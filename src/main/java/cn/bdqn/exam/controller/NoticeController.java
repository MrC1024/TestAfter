package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Notice;
import cn.bdqn.exam.server.NoticeService;
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
@RequestMapping("/NoticeController")
public class NoticeController {
          @Autowired
          private NoticeService noticeService;
            @ResponseBody
            @RequestMapping(value = "/selectByExample",produces="application/json;charset=UTF-8")
            public String selectByExample(){
                 List<Notice> list = noticeService.selectByExample();
                 return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping(value = "/getAll",produces="application/json;charset=UTF-8")
            public String getAll(){
                List<Notice> list = noticeService.getAll();
                return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping("/delect/{noticeid}")
            public  String delect(@PathVariable("noticeid") Integer noticeid){
                    int res = noticeService.delect(noticeid);
                    System.out.print(res);
                    return JSON.toJSONString(res);
            }
            @ResponseBody
            @RequestMapping("/add")
            public  String add(Notice notice, HttpServletRequest request){
                int res =noticeService.add(notice);
                return JSON.toJSONString(res);
            }
            @ResponseBody
            @PostMapping(value = "/getidAll/{noticeid}",produces="application/json;charset=UTF-8")
            public  String getidAll(@PathVariable("noticeid") Integer noticeid){
                        Notice list = noticeService.getidAll(noticeid);
                        return JSON.toJSONString(list);
            }
            @ResponseBody
            @RequestMapping("/update")
            public  String update(Notice notice){
                    int res = noticeService.update(notice);
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
                        noticeService.delect(a);
                    } catch (Exception e) {
                    }
                }
            }
}
