package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.IntegralMapper;
import cn.bdqn.exam.entity.Integral;
import cn.bdqn.exam.server.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegralServiceImpl implements IntegralService {
    @Autowired
    private IntegralMapper integralMapper;
    public List<Integral> getAll() {
        return integralMapper.getAll();
    }
    public int delect(int commodityId) {
        return integralMapper.delect(commodityId);
    }
    public int add(Integral integral) {
        return integralMapper.add(integral);
    }
    public int update(Integral integral) {
        return integralMapper.update(integral);
    }
    public Integral getidAll(int commodityId) {
        return integralMapper.getidAll(commodityId);
    }

    public int updatezt(Integral integral) {
        return 0;
    }
}
