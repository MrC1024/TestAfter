package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Dept;
import cn.bdqn.exam.entity.Video;
import cn.bdqn.exam.entity.Vtype;
import cn.bdqn.exam.entity.Yonghu;
import cn.bdqn.exam.server.VideoService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/video")
public class VideoController {
    @Value("${pic.savePath}")
    String savePaths;
    @Autowired
    VideoService videoService;
    @RequestMapping(value = "/getAll",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAll(){
        List<Video> list = videoService.getAll();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public String del(@PathVariable Integer id){
        int res =  videoService.del(id);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/del2")
    @ResponseBody
    public void del2(HttpServletRequest request){
        String items = request.getParameter("delitems");// System.out.println(items);
        String[] strs = items.split(",");
        for (int i = 0; i < strs.length; i++) {
            try {
                int b = Integer.parseInt(strs[i]);
                videoService.del(b);
            } catch (Exception e) {
            }
        }
    }

    @RequestMapping("/getType")
    @ResponseBody
    public String getBuMen(HttpServletRequest request){
        List<Vtype> list = videoService.getALL();
        return JSON.toJSONString(list);
    }

    @RequestMapping(value = "uploadVidoe", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> savaVideo(@RequestParam("file") MultipartFile file,@RequestParam("gtype")int gtype,@RequestParam("lengthoftime")String lengthoftime,@RequestParam("username")String username)
            throws IllegalStateException {
        Map<String,String> resultMap = new HashMap<String, String>();
        try{
            //获取文件后缀
            String fileExt = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1)
                    .toLowerCase();
            // 重构文件名称
            String pikId = UUID.randomUUID().toString().replaceAll("-", "");
            String newVidoeName = pikId + "." + fileExt;
            //保存视频
            File fileSave = new File(savePaths, newVidoeName);
            file.transferTo(fileSave);
            resultMap.put("resCode","1");
            resultMap.put("webShowPath",newVidoeName);
            System.out.println(newVidoeName);
            Video video=new Video();
            video.setVname(username);
            video.setPath(savePaths+"/"+newVidoeName);
            video.setLengthoftime(lengthoftime);
            video.setVtypeid(gtype);
            int res=videoService.add(video);
            System.out.println(res);
            return  resultMap;

        }catch (Exception e){
            e.printStackTrace();
            resultMap.put("resCode","0");
            return  resultMap ;

        }
    }
    @RequestMapping("/add")
    @ResponseBody
    public String add(Video video, HttpServletRequest request){
         int res = videoService.add(video);
        return JSON.toJSONString(res);
    }

    @RequestMapping(value = "/selById/{id}",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String selById(@PathVariable Integer id){
        System.out.println(id);
        List<Video> list = videoService.getById(id);
        return  JSON.toJSONString(list);
    }
}


