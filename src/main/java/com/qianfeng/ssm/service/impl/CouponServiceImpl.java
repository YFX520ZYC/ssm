package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.CouponDao;
import com.qianfeng.ssm.entity.Coupon;
import com.qianfeng.ssm.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponDao couponDao;

    @Override
    public List<Coupon> findAll() {
       List<Coupon> list = couponDao.findAll();
        return list;
    }
}
