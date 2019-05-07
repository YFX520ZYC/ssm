package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Fmoudle;
import com.qianfeng.ssm.service.FmoudleService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(value = "展示的中间（三个）",tags = "二级表展示")
@RestController
public class FmoudleController {

    @Autowired
    private FmoudleService fmoudleService;

    @ApiOperation(value = "二级菜单展示",notes = "展示的二级菜单内容")
    @GetMapping("fmoudle/twoOrder.do")
    public JsonBean twoOrder(){
        List<Fmoudle> list = fmoudleService.twoOrder();
        return JsonBean.setOK("二级菜单展示",list);
    }
}
