package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Banner;
import cn.bdqn.exam.server.BannerService;
import cn.bdqn.exam.util.Page;
import com.alibaba.fastjson.JSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@MultipartConfig
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;
    @RequestMapping(value = "/getAll",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAll(){
        List<Banner> ls=bannerService.getAll();
        return JSON.toJSONString(ls);
    }

    @RequestMapping("/byban")
    @ResponseBody
    public String byban(HttpServletRequest request){
        String geshi = request.getParameter("geshi");
        if(geshi==""||geshi==null){
            return "banner";
        }
        List<Banner> list=bannerService.byban(geshi);
        System.out.println(list.size());
        return JSON.toJSONString(list);
    }

    @RequestMapping("/del")
    @ResponseBody
    public String del(HttpServletRequest request){
        Integer id = Integer.parseInt(request.getParameter("id"));
        int res = bannerService.del(id);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/del2")
    @ResponseBody
    public void del2(HttpServletRequest request){
        String items = request.getParameter("delitems");// System.out.println(items);
        System.out.println(items);
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int a = Integer.parseInt(strs[i]);
                bannerService.del(a);
            } catch (Exception e) {
            }
        }
    }


    @Value("D://img/")
    private String filePath;
    @RequestMapping("/add")
    public String add(@RequestParam("uploadFile") MultipartFile file,HttpServletRequest request,Banner banner) throws IOException {
//        String fileName = file.getOriginalFilename();   //获取文件名
//        System.out.println(fileName);
//        String suffixName  = fileName.substring(fileName.lastIndexOf(".")); //获取后缀名
//        System.out.println(suffixName);
//        String filePath = "D:\\img";        //文件上传路径
//        fileName = UUID.randomUUID()+suffixName;
//        File dest = new File(filePath+fileName);
//        file.transferTo(dest);
//        banner.setBanName("/img/"+fileName);
//        banner.setBanPath(suffixName);
//        banner.setLink(banner.getLink());
        // 获取上传文件名
        String filename = file.getOriginalFilename();
        // 定义上传文件保存路径
        String path = filePath+"/";

        // 新建文件
        File filepath = new File(path, filename);
        // 判断路径是否存在，如果不存在就创建一个
        if (!filepath.getParentFile().exists()) {
            filepath.getParentFile().mkdirs();
        }
        try {
            // 写入文件
            file.transferTo(new File(path + File.separator + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sqlpath="/img/"+filename;
        String suffixName  = sqlpath.substring(sqlpath.lastIndexOf(".")); //获取后缀名
        banner.setBanName(sqlpath);
        banner.setBanPath(suffixName);
        banner.setLink(banner.getLink());
        bannerService.add(banner);
        return "redirect:/Banner.html";
    }
    @RequestMapping("/upd")
    public String upd(@RequestParam("uploadFile") MultipartFile file,Banner banner) throws IOException {
        // 获取上传文件名
        String filename = file.getOriginalFilename();
        // 定义上传文件保存路径
        String path = filePath+"/";

        // 新建文件
        File filepath = new File(path, filename);
        // 判断路径是否存在，如果不存在就创建一个
        if (!filepath.getParentFile().exists()) {
            filepath.getParentFile().mkdirs();
        }
        try {
            // 写入文件
            file.transferTo(new File(path + File.separator + filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sqlpath="/img/"+filename;
        String suffixName  = sqlpath.substring(sqlpath.lastIndexOf(".")); //获取后缀名
        banner.setBanName(sqlpath);
        banner.setBanPath(suffixName);
        banner.setLink(banner.getLink());
        bannerService.upd(banner);
        return "redirect:/Banner.html";
    }
    @RequestMapping("/updSel/{id}/{link}")
    public String updSel(@PathVariable Integer id,@PathVariable String link,Map<String,Object> map){
        map.put("banId",id);
        map.put("link1",link+".com");
        return "forward:/picture-upd.html";
    }

    @RequestMapping("/getPage")
    @ResponseBody
    public String getPage(HttpServletRequest request){
        System.out.println("1111111111111111111111");
        Integer index = Integer.parseInt(request.getParameter("index"));  //获取当前页数
        System.out.println(index);
//        Integer count =  Integer.parseInt(request.getParameter("count"));   //获取总条数
//        System.out.println(count);
        Page page = new Page();
        page.setCount(bannerService.count());
        page.setContent(bannerService.getPage((index-1)*page.getPageCount(), page.getPageCount()));
        return JSON.toJSONString(page);
    }

    @RequestMapping("/getCount")
    @ResponseBody
    public String getCount(){
        int count = bannerService.count();
        System.out.println("/getCount."+count);
        return JSON.toJSONString(count);
    }







}
