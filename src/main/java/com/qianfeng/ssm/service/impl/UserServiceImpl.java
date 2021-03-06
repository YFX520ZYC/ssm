package com.qianfeng.ssm.service.impl;



import com.qianfeng.ssm.dao.UserDao;
import com.qianfeng.ssm.entity.User;
import com.qianfeng.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.RuntimeErrorException;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User login(String name, String password) {
        User user = userDao.findUserByName(name);
        if (user == null){
            throw new  RuntimeException("用户名错误");
        }
        if (!user.getPassword().equals(password)){
            throw new  RuntimeException("密码错误");
        }
        return user;
    }

    @Override
    public void zhuce(User user) {
        User user1 = userDao.findUserByName(user.getName());
        if(user1 != null){
            throw  new RuntimeException("用户已经存在");
        }else{
            userDao.addUser(user);
        }
    }

}
