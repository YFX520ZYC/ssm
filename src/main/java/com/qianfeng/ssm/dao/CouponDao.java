package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.Coupon;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CouponDao {
    //展示所有的优惠券
    @Select("SELECT * from coupon ORDER BY id asc")
    public List<Coupon>  findAll();
}
