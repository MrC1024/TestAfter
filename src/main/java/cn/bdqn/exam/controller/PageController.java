package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 显示页面的Controller,不需要修改
 */
//@Controller

public class PageController {


    @Resource
    private RedisTemplate<Object, User> redisTemplate;

    @RequestMapping("/toIndex")
    public String toIndex(Map<Object, User> map) {
        User user = (User) redisTemplate.opsForValue().get("user");
        map.put("user", user);
        return "index";
    }

    @RequestMapping("/welcome.html")
    public String welcome() {
        return "welcome.html";
    }

    @RequestMapping("/Banner.html")
    public String banner() {
        return "Banner.html";
    }

    @RequestMapping("/huiYuanGuanLi.html")
    public String huiYuanGuanLi() {
        return "huiYuanGuanLi.html";
    }

    @RequestMapping("/huiYuanGuanLi2.html")
    public String huiYuanGuanLi2() {
        return "huiYuanGuanLi2.html";
    }

    @RequestMapping("/product-brand.html")
    public String productbrand() {
        return "product-brand.html";
    }

    @RequestMapping("/product-category.html")
    public String productcategory() {
        return "product-category.html";
    }

    @RequestMapping("/wenTiFanKui.html")
    public String wenTiFanKui() {
        return "wenTiFanKui.html";
    }

    @RequestMapping("/xiTongGongGao.html")
    public String xiTongGongGaos() {
        return "xiTongGongGao.html";
    }

    @RequestMapping("/picture-list.html")
    public String picture() {
        return "picture-list.html";
    }

    @RequestMapping("/picture-list1.html")
    public String picture1() {
        return "picture-list.html";
    }

    @RequestMapping("/picture-list2.html")
    public String picture2() {
        return "picture-list.html";
    }

    @RequestMapping("/member-list.html")
    public String member1() {
        return "member-list.html";
    }

    @RequestMapping("/feedback-list.html")
    public String feedback1() {
        return "feedback-list.html";
    }

    @RequestMapping("/charts-4.html")
    public String charts4() {
        return "charts-4.html";
    }

    @RequestMapping("/picture-add.html")
    public String pictureadd() {
        return "picture-add.html";
    }

    @RequestMapping("/product-upd.html")
    public String productupd() {
        return "product-upd.html";
    }
    @RequestMapping("/jueseguanli.html")
    public String jueseguanli() {
        return "jueseguanli.html";
    }

}
