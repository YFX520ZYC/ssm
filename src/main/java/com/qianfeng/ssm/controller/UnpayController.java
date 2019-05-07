package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Unpay;
import com.qianfeng.ssm.service.UnpayService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnpayController {

    @Autowired
    private UnpayService unpayService;

    @GetMapping("unpay/findAll.do")
    public JsonBean showAllUnpay(Integer u_id){

     List<Unpay> list = unpayService.showAllUnpay(u_id);
        return JsonBean.setOK("展示所有待付款成功", list);
    }
}
