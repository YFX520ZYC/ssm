package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.HeadList;
import com.qianfeng.ssm.entity.HomePage;
import com.qianfeng.ssm.service.HomePageService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "首页锦囊",tags = "两个展示")
@RestController
public class HomePageController {

    @Autowired
    private HomePageService homePageService;
//这是
    @ApiOperation(value = "随机展示三条新闻",notes = "新闻")
    @GetMapping("homepage/querythreeall.do")
    public JsonBean queryAll(){
        List<HomePage> list = homePageService.queryThreeAll();
        return JsonBean.setOK("展示成功",list);
    }

    @ApiOperation(value = "主图展示",notes = "主图展示一条新闻")
    @GetMapping("headlist/queryoneall.do")
    public JsonBean queryOneAll(){
       HeadList headList =  homePageService.queryOneAll();
        return  JsonBean.setOK("展示成功",headList);
    }



}
