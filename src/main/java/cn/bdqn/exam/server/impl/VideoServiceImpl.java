package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.VideoMapper;
import cn.bdqn.exam.po.Video;
import cn.bdqn.exam.server.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoMapper videoMapper;

    public List<Video> getAll() {
        return videoMapper.getAll();
    }



}
