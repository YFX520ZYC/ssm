package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Coupon;
import com.qianfeng.ssm.service.CouponService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CouponController {
    @Autowired
    private CouponService couponService ;

    @GetMapping("coupon/all.do")
    public JsonBean findAll(){

        List<Coupon> list = null;
        try {
            list = couponService.findAll();
            return JsonBean.setOK("优惠券展示成功！！！",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonBean.setError("优惠券展示失败！！！",null);
    }
}
