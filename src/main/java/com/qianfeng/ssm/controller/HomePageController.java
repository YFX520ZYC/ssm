package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.HomePage;
import com.qianfeng.ssm.service.HomePageService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomePageController {

    @Autowired
    private HomePageService homePageService;

    @GetMapping("homepage/querythreeall.do")
    public JsonBean queryAll(){
        List<HomePage> list = homePageService.queryThreeAll();
        return JsonBean.setOK("展示成功",list);
    }

}
