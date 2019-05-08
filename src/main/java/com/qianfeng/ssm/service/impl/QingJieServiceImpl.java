package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.QingJieDao;
import com.qianfeng.ssm.entity.QingJie;
import com.qianfeng.ssm.service.QingJieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QingJieServiceImpl implements QingJieService {
    @Autowired
    private QingJieDao qingJieDao;
    @Override
    public List<QingJie> selectAllQJ() {
        List<QingJie> list = qingJieDao.selectAll();
        return list;
    }
}
