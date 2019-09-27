package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.VideoMapper;
import cn.bdqn.exam.entity.Author;
import cn.bdqn.exam.entity.Video;
import cn.bdqn.exam.entity.Vtype;
import cn.bdqn.exam.server.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoMapper  videoMapper;

    public List<Video> getAll() {
        return videoMapper.getAll();
    }

    public int add(Video video) {
        return videoMapper.add(video);
    }

    public int del(int id) {
        return videoMapper.del(id);
    }

    public List<Vtype> getALL() {
        return videoMapper.getALL();
    }

    @Override
    public List<Author> getZuo() {
        return videoMapper.getZuo();
    }

    public List<Video> getById(int id) {
        return videoMapper.getById(id);
    }

    public Map<String, String> savaVideo(MultipartFile file) {
        return videoMapper.savaVideo(file);
    }

    @Override
    public Author getJiang(int id) {
        return videoMapper.getJiang(id);
    }
}
