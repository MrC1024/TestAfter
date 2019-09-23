package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Test;
import cn.bdqn.exam.server.TestService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestHandler {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/getAll/{pageNum}/{pageSize}",produces="application/json;charset=UTF-8")
    @ResponseBody
    public List<Test> getAll(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
        Page<Test> objects = PageHelper.startPage(pageNum, pageSize);
        objects.setOrderBy("aid");
        return testService.getAll();
    }

    @GetMapping("/updTestStatus/{id}")
    @ResponseBody
    public int updTestStatus(@PathVariable("id") Integer id) {
        return testService.updTestStatus(id);
    }

    @PostMapping("/QueryTestNameByLike")
    @ResponseBody
    public List<Test> QueryTestNameByLike(@RequestParam("testName") String testName) {
        PageHelper.startPage(1, 10);
        return testService.QueryTestNameByLike(testName);
    }

    @RequestMapping("/product-add")
    public String picture_add() {
        return "product-add";
    }

    @RequestMapping("/picture-list")
    public String picture() {
        return "picture-list";
    }

    @GetMapping(value = "/QueryDeptAll",produces="application/json;charset=UTF-8")
    @ResponseBody
    public List<Dept> QueryDeptAll() {
        return testService.QueryDeptAll();
    }

    @RequestMapping("/addTest")
    @ResponseBody
    public int addTest(Test test) {
        System.out.println(test);
        return testService.addTest(test);
    }

    @GetMapping("/testCount")
    @ResponseBody
    public Integer testCount() {
        return testService.testCount();
    }

    @GetMapping("/upd1/{id}")
    public String upd1(@PathVariable("id") Integer id, Map map) {
        Test test = testService.QueryTestById(id);
        List<Dept> depts = testService.QueryDeptAll();
        map.put("test", test);
        map.put("depts", depts);
        return "product-upd";
    }

    @PostMapping("/updTest")
    public @ResponseBody
    Integer updTest(Test test) {
        test.setTestDates(new Date());
        System.out.println(test);
        int i = testService.updTest(test);
        return i;
    }

    @GetMapping("/QueryTestById/{id}")
    public @ResponseBody
    Test QueryTestById(@PathVariable("id") Integer id) {
        //System.out.println(JSON.toJSONString(testService.QueryTestById(id)));
        return testService.QueryTestById(id);
    }
}
