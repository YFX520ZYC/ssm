package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.ChengJiu;
import com.qianfeng.ssm.service.ChengJiuService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "成就操作",tags = "成就操作")

@RestController
public class ChengJiuController {
    @Autowired
    private ChengJiuService chengJiuService;

    //展示所有成就
    @ApiOperation(value = "展示所有成就操作",notes = "展示所有成就操作")
    @GetMapping("chengjiu/chengjiu.do")
    public JsonBean findAll(Integer u_id){
        List<ChengJiu> list = chengJiuService.findAll(u_id);
        return JsonBean.setOK("展示所有成就",list);
    }

    //添加成就
    @ApiOperation(value = "添加成就操作",notes = "添加成就操作")
    @GetMapping("chengjiu/addchengjiu.do")
    public JsonBean addChengJiu(ChengJiu chengJiu){
        chengJiuService.addChengJiu(chengJiu);
        return JsonBean.setOK("添加成功",null);
    }
}
