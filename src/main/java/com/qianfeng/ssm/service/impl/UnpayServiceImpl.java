package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.UnpayDao;
import com.qianfeng.ssm.entity.Unpay;
import com.qianfeng.ssm.service.UnpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnpayServiceImpl implements UnpayService {

    @Autowired
    private UnpayDao unpayDao;

    @Override
    public List<Unpay> showAllUnpay(Integer id) {
     List<Unpay> list  =   unpayDao.showAll(id);
        return list;
    }
}
