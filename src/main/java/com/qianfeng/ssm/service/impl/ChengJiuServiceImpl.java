package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.ChengJiuDao;
import com.qianfeng.ssm.entity.ChengJiu;
import com.qianfeng.ssm.service.ChengJiuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChengJiuServiceImpl implements ChengJiuService {
    @Autowired
    private ChengJiuDao chengJiuDao;

    @Override
    public List<ChengJiu> findAll(Integer u_id) {
        List<ChengJiu> list = chengJiuDao.finaAll(u_id);
        return list;
    }

    @Override
    public void addChengJiu(ChengJiu chengJiu) {
        chengJiuDao.addChengJiu(chengJiu);
    }
}
