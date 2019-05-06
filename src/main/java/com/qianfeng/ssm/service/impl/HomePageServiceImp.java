package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.HomePageDao;
import com.qianfeng.ssm.entity.HeadList;
import com.qianfeng.ssm.entity.HomePage;
import com.qianfeng.ssm.service.HomePageService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomePageServiceImp implements HomePageService {
    @Autowired
    private HomePageDao homePageDao;

    @Override
    public List<HomePage> queryThreeAll() {
        List<HomePage> list = homePageDao.queryThreedALL();
        return list;
    }

    @Override
    public HeadList queryOneAll() {
        HeadList headList = homePageDao.queryOne();
        return headList;
    }
}
