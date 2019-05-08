package com.qianfeng.ssm.controller;


import com.qianfeng.ssm.entity.Baby;
import com.qianfeng.ssm.service.BabyService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "展示所有宝宝必备列表",tags = "展示所有宝宝必备列表")
public class BabyController {
    @Autowired
    private BabyService babyService;

    @ApiOperation(value = "展示所有宝宝必备列表",notes = "展示所有宝宝必备列表")
    @GetMapping("baby/all.do")
    public JsonBean findAllBaby(Integer u_id){

        List<Baby> list = null;
        try {
            list = babyService.findAllBaby(u_id);
            return JsonBean.setOK("宝宝必备列表展示成功！！！",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonBean.setError("宝宝必备列表展示失败！！！",null);
    }
}
