package cn.bdqn.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aContr {
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index.html";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }
    @RequestMapping("/Banner")
    public String banner(){
        return "Banner.html";
    }
    @RequestMapping("/huiYuanGuanLi")
    public String huiYuanGuanLi(){
        return "huiYuanGuanLi.html";
    }
    @RequestMapping("/huiYuanGuanLi2")
    public String huiYuanGuanLi2(){
        return "huiYuanGuanLi2.html";
    }
    @RequestMapping("/product-brand")
    public String productbrand(){
        return "product-brand.html";
    }
    @RequestMapping("/product-category")
    public String productcategory(){
        return "product-category.html";
    }
    @RequestMapping("/wenTiFanKuil")
    public String wenTiFanKui(){
        return "wenTiFanKui.html";
    }
    @RequestMapping("/xiTongGongGao.html")
    public String xiTongGongGaos(){
        return "xiTongGongGao.html";
    }
    @RequestMapping("/picture-list.html")
    public String picture(){
        return "picture-list.html";
    }
    @RequestMapping("/picture-list1.html")
    public String picture1(){
        return "picture-list.html";
    }
    @RequestMapping("/picture-list2.html")
    public String picture2(){
        return "picture-list.html";
    }

    @RequestMapping("/member-list.html")
    public String member1(){
        return "member-list.html";
    }
    @RequestMapping("/feedback-list.html")
    public String feedback1(){
        return "feedback-list.html";
    }

    @RequestMapping("/charts-4.html")
    public String charts4(){
        return "charts-4.html";
    }





}
