package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.UserListDao;
import com.qianfeng.ssm.entity.UserList;
import com.qianfeng.ssm.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserListServiceImpl implements UserListService{
    @Autowired
    private UserListDao userListDao;
    //展示所有个人信息
    @Override
    public UserList showMsg(Integer id) {
      UserList userList =  userListDao.showHeadMsg(id);
        return userList;
    }

    //完善个人信息
    @Override
    public void addMsg(UserList userList) {
        userListDao.addMsg1(userList);
    }

    //跟新个人信息
    @Override
    public void updateUserMsg(Integer id) {
        userListDao.updateMsg(id);
    }
}
