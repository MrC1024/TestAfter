package cn.bdqn.exam.controller;

import cn.bdqn.exam.dao.ScoreMapper;
import cn.bdqn.exam.entity.Notice;
import cn.bdqn.exam.entity.Score;
import cn.bdqn.exam.server.ScoreService;
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
@RequestMapping("/Score")
public class ScoreController {
        @Autowired
        private ScoreService scoreService;
        @ResponseBody
        @RequestMapping(value = "/scoreGetAll",produces="application/json;charset=UTF-8")
        public String scoreGetAll(){
            List<Score> list = scoreService.scoreGetAll();
            return JSON.toJSONString(list);
        }
        @ResponseBody
        @RequestMapping("/delect/{scoreid}")
        public  String delect(@PathVariable("scoreid") Integer scoreid){
            int res = scoreService.delect(scoreid);
            return JSON.toJSONString(res);
        }
        @ResponseBody
        @RequestMapping("/add")
        public  String add(Score score, HttpServletRequest request){
            int res =scoreService.add(score);
            return JSON.toJSONString(res);
        }
        @ResponseBody
        @PostMapping(value = "/getidAll/{scoreid}",produces="application/json;charset=UTF-8")
        public  String getidAll(@PathVariable("scoreid") Integer scoreid){
            Score list = scoreService.getidAll(scoreid);
            return JSON.toJSONString(list);
        }
        @ResponseBody
        @RequestMapping("/update")
        public  String update(Score score){
            int res = scoreService.update(score);
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
                    scoreService.delect(a);
                } catch (Exception e) {
                }
            }
        }
}
