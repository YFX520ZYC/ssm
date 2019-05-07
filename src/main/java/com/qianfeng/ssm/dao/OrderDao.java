package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.Order;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderDao {

    //查询所有的订单
    @Select("select * from myorder where u_id = #{u_id}")
    public List<Order> findAll(Integer id);
}
