package com.qianfeng.ssm.entity;

import lombok.Data;

@Data
public class Coupon {   //我的 :优惠券展示

    private Integer id;
    private String couponName;
    private Integer number;
    private Integer outof ;
    private Integer remain;

}
