package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.UserList;
import org.apache.ibatis.annotations.Select;

public interface UserListDao {

    //展示我的页面上的头像，昵称和描述
    @Select("select * from userlist where u_id = #{id}")
     public UserList showHeadMsg(Integer id);




}
