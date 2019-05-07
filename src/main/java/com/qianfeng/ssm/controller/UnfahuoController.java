package com.qianfeng.ssm.controller;


import com.qianfeng.ssm.entity.Unfahuo;
import com.qianfeng.ssm.service.UnfahuoService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnfahuoController {

    @Autowired
    private UnfahuoService unfahuoService;

    @GetMapping("unfahuo/findAll.do")
    public JsonBean showAllUnfahuo(Integer u_id){
        List<Unfahuo> list = unfahuoService.showAllUnfahuo(u_id);
        return JsonBean.setOK("展示所有待付款成功", list);
    }

}
