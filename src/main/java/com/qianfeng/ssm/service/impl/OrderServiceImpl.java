package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.OrderDao;
import com.qianfeng.ssm.entity.Order;
import com.qianfeng.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    //查询所有的订单
    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> findAllOrder(Integer id) {
      List<Order> list =  orderDao.findAll(id);
        System.out.println(list);
        return  list;
    }
}
