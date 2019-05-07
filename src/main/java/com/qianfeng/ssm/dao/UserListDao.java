package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.UserList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserListDao {

    //展示我的页面上的头像，昵称和描述
    @Select("select * from userlist where u_id = #{id}")
     public UserList showHeadMsg(Integer id);

    //完善个人信息
    @Insert("insert into userlist(l_id,age,bloodtype,headphoto,email,phone,nicheng,description,u_id) values(null,#{age},#{bloodtype},#{headphoto},#{email},#{phone},#{nicheng},#{description},null)")
    public void addMsg1(UserList userList);

    //跟新个人信息
    @Update("update userlist set age = #{age},bloodtype=#{bloodtype},headphoto=#{headphoto},email=#{email},phone=#{phone},nicheng=#{nicheng},description=#{description},u_id=#{u_id}")
    public void  updateMsg(Integer id);





}
