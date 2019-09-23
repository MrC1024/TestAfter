package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.NoticeMapper;
import cn.bdqn.exam.entity.Notice;
import cn.bdqn.exam.server.NoticeService;
import org.mockito.internal.matchers.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    public List<Notice> selectByExample() {
        return noticeMapper.selectByExample();
    }

    public List<Notice> getAll() {
        return noticeMapper.getAll();
    }

    public int delect(int id) {
        return noticeMapper.delect(id);
    }

    public int add(Notice mism) {
        return noticeMapper.add(mism);
    }

    public int update(Notice mism) {
        return noticeMapper.update(mism);
    }

    public Notice getidAll(int id) {
        return noticeMapper.getidAll(id);
    }

}
