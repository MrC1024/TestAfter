package cn.bdqn.exam.controller;

import cn.bdqn.exam.po.Video;
import cn.bdqn.exam.server.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    @RequestMapping("/getAll")
    public String getAll(){
        List<Video> list =videoService.getAll();
        return null;
    }
}
