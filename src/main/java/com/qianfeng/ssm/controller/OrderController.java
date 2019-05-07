package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Order;
import com.qianfeng.ssm.service.OrderService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("order/findAll.do")
    public JsonBean findAllOrder(Integer u_id){
        List<Order> list = orderService.findAllOrder(u_id);
        System.out.println(list);
        return JsonBean.setOK("展示所有订单信息成功", list);
    }
}
