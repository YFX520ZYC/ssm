package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.AttenList;
import com.qianfeng.ssm.entity.Attention;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AttenListDao {

    //直接展示关注所有的人的说说
    @Select("SELECT b.name,b.time,b.baoage,b.neirong,b.like from attention a INNER JOIN attenlist b ON a.attenid = b.attenid WHERE a.u_id = #{u_id} ORDER BY b.time desc")
    public List<AttenList> findAll(int id);

    //判断是否关注的人已经存在。
    @Select("select * from attention where attenid = #{attenid}")
    public Attention queryAll(int attenid);

    //关注这个人，就相当于添加数据。
     @Insert("INSERT INTO attention VALUES(null,#{u_id},#{attenid})")
    public void save(Attention attention);

     //取消关注，就相当于删除。
     @Delete("delete from attention where attenid = #{attenid}")
     public void deleteById(int attenid);

}
