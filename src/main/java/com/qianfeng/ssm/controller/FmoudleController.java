package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Fmoudle;
import com.qianfeng.ssm.service.FmoudleService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FmoudleController {

    @Autowired
    private FmoudleService fmoudleService;

    @GetMapping("fmoudle/twoOrder.do")
    public JsonBean twoOrder(){
        List<Fmoudle> list = fmoudleService.twoOrder();
        return JsonBean.setOK("二级菜单展示",list);
    }
}
