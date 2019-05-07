package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.UserList;
import com.qianfeng.ssm.service.UserListService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户详细信息列表",tags = "用户详细信息列表")
public class UserListController {

    @Autowired
    private UserListService userListService;

    @ApiOperation(value = "展示昵称头像描述信息",notes = "展示昵称头像描述信息")
    @GetMapping("my/head.do")
    public JsonBean queryHead(Integer u_id){
        UserList userList = userListService.showMsg(u_id);
        System.out.println(userList);
            return JsonBean.setOK("头像展示成功",userList);
    }
    @ApiOperation(value = "添加用户详细信息列表",notes = "添加用户详细信息列表")
    @GetMapping("my/addMsg.do")
    public JsonBean addMsg(UserList userList){
        userListService.addMsg(userList);
        System.out.println(userList);
        return JsonBean.setOK("完善个人信息成功", null);
    }

    @ApiOperation(value = "修改用户详细信息列表",notes = "修改用户详细信息列表")
    @GetMapping("my/updateMsg.do")
    public JsonBean updateMsg(Integer id){
        userListService.updateUserMsg(id);
        return JsonBean.setOK("修改个人信息成功", null);
    }
}
