package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Unpay;
import com.qianfeng.ssm.service.UnpayService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "待付款",tags = "待付款")
public class UnpayController {

    @Autowired
    private UnpayService unpayService;

    @ApiOperation(value = "待付款",notes = "待付款")
    @GetMapping("unpay/findAll.do")
    public JsonBean showAllUnpay(Integer u_id){

     List<Unpay> list = unpayService.showAllUnpay(u_id);
        return JsonBean.setOK("展示所有待付款成功", list);
    }
}
