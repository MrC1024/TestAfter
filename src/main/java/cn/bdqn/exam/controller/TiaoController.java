package cn.bdqn.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TiaoController {
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }
 @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }


    @RequestMapping("/Banner")
    public String banner() {
        return "Banner.html";
    }


    @RequestMapping("/huiYuanGuanLi")
    public String huiYuanGuanLi() {
        return "huiYuanGuanLi.html";
    }

    @RequestMapping("/huiYuanGuanLi2")
    public String huiYuanGuanLi2() {
        return "huiYuanGuanLi2.html";
    }

    @RequestMapping("/product-brand")
    public String productbrand() {
        return "product-brand.html";
    }

    @RequestMapping("/product-category")
    public String productcategory() {
        return "product-category.html";
    }

    @RequestMapping("/wenTiFanKui")
    public String wenTiFanKui() {
        return "wenTiFanKui.html";
    }

    @RequestMapping("/xiTongGongGao")
    public String xiTongGongGaos() {
        return "xiTongGongGao.html";
    }

    @RequestMapping("/picture-list")
    public String picture() {
        return "picture-list.html";
    }

    @RequestMapping("/picture-list1")
    public String picture1() {
        return "picture-list1.html";
    }

    @RequestMapping("/picture-list2")
    public String picture2() {
        return "picture-list2.html";
    }

    @RequestMapping("/member-list")
    public String member1() {
        return "member-list.html";
    }

    @RequestMapping("/feedback-list")
    public String feedback1() {
        return "feedback-list.html";
    }

    @RequestMapping("/charts-4")
    public String charts4() {
        return "charts-4.html";
    }


    @RequestMapping("/member-add")
    public String memberadd() {
        return "member-add.html";
    }

    @RequestMapping("/picture-add")
    public String pictureadd() {
        return "picture-add.html";
    }


    @RequestMapping("/change-password")
    public String  changepassword() {
        return "change-password.html";
    }


    @RequestMapping("/member-show")
    public String  membershow() {
        return "member-show.html";
    }
}

