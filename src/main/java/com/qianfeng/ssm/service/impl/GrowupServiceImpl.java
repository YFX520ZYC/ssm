package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.GrowupDao;
import com.qianfeng.ssm.entity.Growup;
import com.qianfeng.ssm.service.GrowupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrowupServiceImpl implements GrowupService {

    @Autowired
    private GrowupDao growupDao;

    @Override
    public List<Growup> findAll(Integer u_id) {
       List<Growup> list= growupDao.findAll(u_id);
        return list;
    }

    @Override
    public void addGrowup(Growup growup) {
         growupDao.addGrowup(growup);
    }

    @Override
    public void deleteGrowup(Integer g_id) {
        growupDao.deleteGrowup(g_id);
    }


}
