package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.QingJie;
import com.qianfeng.ssm.service.QingJieService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value="清洁物品展示",tags = "清洁物品展示区随机展示6条数据")
@RestController
public class QingJieController {

    @Autowired
    private QingJieService qingJieService;

    @ApiOperation(value = "清洁物品展示",notes ="清洁物品展示")
    @GetMapping("qj/selectall.do")
    public JsonBean selectAll(){
        List<QingJie> list = qingJieService.selectAllQJ();
        return JsonBean.setOK("清洁商品展示",list);
    }
}
