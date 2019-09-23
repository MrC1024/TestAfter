package cn.bdqn.exam.dao;

import cn.bdqn.exam.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;


@MapperScan
@Repository
public interface userEachartsMapper {
    /**
     * 图表获取数据
     */
    public List<User> finduserEacharts();
}
