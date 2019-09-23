package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.Notice;
import cn.bdqn.exam.entity.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreMapper {
    List<Score>  scoreGetAll();
    //删除
    int delect(@Param("Scoreid") int Scoreid);
    //添加
    int add(Score score);
    //修改
    int update(Score score);
    Score getidAll(@Param("Scoreid") int Scoreid);

}
