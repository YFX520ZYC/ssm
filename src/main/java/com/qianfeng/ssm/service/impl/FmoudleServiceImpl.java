package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.FmoudleDao;
import com.qianfeng.ssm.entity.Fmoudle;
import com.qianfeng.ssm.service.FmoudleService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FmoudleServiceImpl implements FmoudleService {
    @Autowired
    private FmoudleDao fmoudleDao;

    @Override
    public List<Fmoudle> twoOrder() {

        List<Fmoudle> list = fmoudleDao.twoMoudle();
        return list;
    }
}
