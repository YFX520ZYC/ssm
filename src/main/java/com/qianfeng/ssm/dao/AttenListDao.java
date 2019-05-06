package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.AttenList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AttenListDao {

    //展示关注所有的人的说说
    @Select("SELECT * from attenlist where u_id = #{u_id}")
    public List<AttenList> findAll(int id);

  /*  //判断是否已经关注过这个人
    @Select("SELECT * from attenlist where u_id = #{u_id} and attenid = #{attenid}")
    public List<AttenList> findAll(int u_id,int attenid);

    //没有增加关注（添加）{假设已经有一个表等在着被关注}
    @Insert("INSERT INTO attenlist value (null,#{name},NOW(),#{baoage},#{neirong},#{like},#{attendid},#{u_id})")
    public void addAtten(AttenList attenList);

    //再点就是取消关注。（删除）
    @Delete("DELETE FROM attenlist where attenid = #{id}")
    public void deleteById(int attenid);*/
}
