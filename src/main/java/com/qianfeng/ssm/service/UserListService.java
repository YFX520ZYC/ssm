package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.UserList;

public interface UserListService  {

    //展示昵称头像描述信息
    public UserList showMsg(Integer id);

    //完善个人信息
    public void addMsg(UserList userList);

    //跟新个人信息
    public void  updateUserMsg(Integer id);
}
