package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.BabyDao;
import com.qianfeng.ssm.entity.Baby;
import com.qianfeng.ssm.service.BabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BabyServiceImpl implements BabyService {
    @Autowired
    private BabyDao babyDao;
    @Override
    public List<Baby> findAllBaby(Integer id) {
        List<Baby> list = babyDao.findAll(id);
        return list;
    }
}
