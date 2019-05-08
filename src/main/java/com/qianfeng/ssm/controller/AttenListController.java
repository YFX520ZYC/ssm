package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.AttenList;
import com.qianfeng.ssm.entity.Attention;
import com.qianfeng.ssm.entity.User;
import com.qianfeng.ssm.service.AttenListService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
@Api(value = "关注",tags = "生活模块关注的人物")
@RestController
public class AttenListController {

    @Autowired
    private AttenListService attenListService;

    /**
     *
     * @param session
     * @return
     */
    @ApiOperation(value = "直接进入关注区",notes = "展示所有已经关注的")
    @GetMapping("atten/findall.do")
    public JsonBean findAll(HttpSession session){
        User user = (User) session.getAttribute("user");

        List<AttenList> byAll = attenListService.findByAll(user.getUid());
       return  JsonBean.setOK("所有关注的展示",byAll) ;
    }

    @ApiOperation(value = "判断是否已经关注",notes = "最终展示的关注的内容")
    @GetMapping("atten/ifatten.do")
    public JsonBean ifAtten(Attention attention){
        return  attenListService.likeall(attention);
    }

}
