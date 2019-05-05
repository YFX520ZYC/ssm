package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface UserDao {

    //登陆
    @Select("select * from user where name=#{name}")
    public User findUserByName(String name);

     //根据用户名密码进行 注册 添加用post
    @Insert("insert into user(name,password) values(#{name},#{password})")
    public void  addUser(User user);






}
