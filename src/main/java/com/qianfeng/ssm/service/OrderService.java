package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.Order;

import java.util.List;

public interface OrderService {

    //查询所有的订单
    public List<Order> findAllOrder(Integer id);
}
