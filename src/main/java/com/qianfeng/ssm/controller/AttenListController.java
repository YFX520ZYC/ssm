package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.AttenList;
import com.qianfeng.ssm.entity.Attention;
import com.qianfeng.ssm.service.AttenListService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttenListController {

    @Autowired
    private AttenListService attenListService;



    /**
     * 关注后如何进行展示。
     * @param u_id
     * @return
     */
    @GetMapping("atten/findall.do")
    public JsonBean findAll(int u_id){
        List<AttenList> byAll = attenListService.findByAll(u_id);
       return  JsonBean.setOK("所有关注的展示",byAll) ;
    }

    @GetMapping("atten/ifatten.do")
    public JsonBean ifAtten(Attention attention){

        return  attenListService.likeall(attention);

    }
}
