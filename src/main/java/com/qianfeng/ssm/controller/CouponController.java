package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Coupon;
import com.qianfeng.ssm.service.CouponService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "所有优惠券展示",tags = "所有优惠券展示")
public class CouponController {
    @Autowired
    private CouponService couponService ;

    @ApiOperation(value = "优惠券展示",notes = "优惠券展示")
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
