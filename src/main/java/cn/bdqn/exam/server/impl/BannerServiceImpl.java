package cn.bdqn.exam.server.impl;

import cn.bdqn.exam.dao.BannerMapper;
import cn.bdqn.exam.entity.Banner;
import cn.bdqn.exam.server.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannerServiceImpl implements BannerService
{

    @Autowired
    private BannerMapper bannerMapper;

    public List<Banner> getAll() {
        return bannerMapper.getAll();
    }


    public int add(Banner banner) {
        return bannerMapper.add(banner);
    }

    public int upd(Banner banner) {
        return bannerMapper.upd(banner);
    }

    public int del(int ifSel) {
        return bannerMapper.del(ifSel);
    }

    public List<Banner> getPage(Integer num1, Integer num2) {
        return bannerMapper.getPage(num1,num2);
    }

    public int count() {
        return bannerMapper.count();
    }

    public List<Banner> byban(String banPath) {
        return bannerMapper.byban(banPath);
    }


}
