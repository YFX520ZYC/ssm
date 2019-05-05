package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.User;
import com.qianfeng.ssm.entity.UserList;

import java.util.List;


public interface UserService {

     //login
    public  User login(String name,String password);

    //注册
    public void  zhuce(User user);



}
