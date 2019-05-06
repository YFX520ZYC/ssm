package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.ChengJiu;
import com.qianfeng.ssm.service.ChengJiuService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChengJiuController {
    @Autowired
    private ChengJiuService chengJiuService;

    //展示所有成就
    @GetMapping("chengjiu/chengjiu.do")
    public JsonBean findAll(Integer u_id){
        List<ChengJiu> list = chengJiuService.findAll(u_id);
        return JsonBean.setOK("展示所有成就",list);
    }

    //添加成就
    @RequestMapping("chengjiu/addchengjiu.do")
    public JsonBean addChengJiu(ChengJiu chengJiu){
        chengJiuService.addChengJiu(chengJiu);
        return JsonBean.setOK("添加成功",null);
    }
}
