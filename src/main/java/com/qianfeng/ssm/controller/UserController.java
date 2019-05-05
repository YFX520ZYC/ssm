package com.qianfeng.ssm.controller;


import com.qianfeng.ssm.entity.User;
import com.qianfeng.ssm.entity.UserList;
import com.qianfeng.ssm.service.UserListService;
import com.qianfeng.ssm.service.UserService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //用户登录
    @GetMapping("user/login.do")
    public JsonBean login(String name,String password,HttpSession session) {

        User user = userService.login(name,password);
       // new String(user.getName().getBytes());
        session.setAttribute("user", user);
        return JsonBean.setOK("登陆成功",user);

    }
    //用户注册
  @PostMapping("user/add.do")
    public JsonBean login(User user,HttpSession session) {
        userService.zhuce(user);
        session.setAttribute("user", user);
        return JsonBean.setOK("注册成功",user);

    }



}
