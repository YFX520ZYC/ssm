package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.Coupon;

import java.util.List;

public interface CouponService {

    //展示所有的优惠券
    public List<Coupon> findAll();


}
