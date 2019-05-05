package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.UserList;
import com.qianfeng.ssm.service.UserListService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserListController {

    @Autowired
    private UserListService userListService;

    @GetMapping("my/head.do")
    public JsonBean queryHead(Integer u_id){
        UserList userList = userListService.showMsg(u_id);
        System.out.println(userList);
            return JsonBean.setOK("头像展示成功",userList);
    }
}
