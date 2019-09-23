package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.ScoreMapper;
import cn.bdqn.exam.entity.Score;
import cn.bdqn.exam.server.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    public List<Score> scoreGetAll() {
        return scoreMapper.scoreGetAll();
    }

    public int delect(int Scoreid) {
        return scoreMapper.delect(Scoreid);
    }

    public int add(Score score) {
        return scoreMapper.add(score);
    }

    public int update(Score score) {
        return scoreMapper.update(score);
    }

    public Score getidAll(int Scoreid) {
        return scoreMapper.getidAll(Scoreid);
    }
}
