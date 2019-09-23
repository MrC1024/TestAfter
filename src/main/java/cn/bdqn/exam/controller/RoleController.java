package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Role;
import cn.bdqn.exam.server.RoleService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/role")
@Controller
public class RoleController {
    @Autowired
    RoleService roleService;
    @ResponseBody
    @RequestMapping("/finaByRole")
    public String finaByRole(){
        List<Role> roles=roleService.finaByRole();
        return JSON.toJSONString(roles);
    }
    @RequestMapping(value = "/delByRoleId/{rid}",produces="application/json;charset=UTF-8")
    public String delByRoleId(Integer rid){
        Integer res=roleService.delByRoleId(rid);
        return JSON.toJSONString(res);
    }
    @RequestMapping("/updByRoleName/{rnamee}")
    public  String updByRoleName(String rname){
        Integer res=roleService.updByRoleName(rname);
        return  JSON.toJSONString(res);
    }
}
