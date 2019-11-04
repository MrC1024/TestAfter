package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.AuthorMapper;
import cn.bdqn.exam.dao.BannerMapper;
import cn.bdqn.exam.entity.Author;
import cn.bdqn.exam.server.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public List<Author> getAll() {
        return authorMapper.getAll();
    }

    @Override
    public int del(int id) {
        return authorMapper.del(id);
    }

    @Override
    public int add(Author author) {
        return authorMapper.add(author);
    }

    @Override
    public Author getById(int id) {
        return authorMapper.getById(id);
    }

    @Override
    public int videoCount(String name) {
        return authorMapper.videoCount(name);
    }
}
