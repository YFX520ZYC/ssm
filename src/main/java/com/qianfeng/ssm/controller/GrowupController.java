package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Growup;
import com.qianfeng.ssm.service.GrowupService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Api(value = "成长记录操作",tags = "成长记录操作")

@RestController
public class GrowupController {
    @Autowired
    private GrowupService growupService;

    //展示所有成长记录
    @ApiOperation(value = "展示所有成长记录操作",notes = "展示所有成长记录操作")
    @GetMapping("growup/growup.do")
    public JsonBean findAll(Integer u_id){
        List<Growup> list = growupService.findAll(u_id);
        return JsonBean.setOK("展示所有成长记录",list);
    }

    //添加成长记录
    @ApiOperation(value = "添加成长记录操作",notes = "添加成长记录操作")
    @GetMapping("growup/addgrowup.do")
    public  JsonBean addGrowup(@DateTimeFormat(pattern = "yyyy-MM-dd")Date data,Integer size,String detail,Double height,Double head,Double weight,Integer u_id){
        Growup growup = new Growup();
        growup.setData(data);
        growup.setSize(size);
        growup.setDetail(detail);
        growup.setHeight(height);
        growup.setHead(head);
        growup.setWeight(weight);
        growup.setU_id(u_id);
        growupService.addGrowup(growup);
        return JsonBean.setOK("添加成长记录成功",null);
    }
    //删除成长记录
    @ApiOperation(value = "删除成长记录操作",notes = "删除成长记录操作")
    @RequestMapping("growup/deletegrowup.do")
    public JsonBean deleteGrowup(Integer g_id){
        growupService.deleteGrowup(g_id);
        return JsonBean.setOK("删除成功",null);
    }

}
