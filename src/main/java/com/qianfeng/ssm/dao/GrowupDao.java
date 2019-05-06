package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.Growup;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface GrowupDao {
    //展示所有成长记录
    @Select("SELECT * from growup where u_id =#{u_id}")
    public List<Growup> findAll(Integer u_id);

    //添加成长记录
    @Insert("insert into growup (g_id,data,size,detail,height,head,weight,u_id)values(null,#{data},#{size},#{detail},#{height},#{head},#{weight},#{u_id})")
    public void addGrowup(Growup growup);

    //删除成长记录
    @Delete("delete from growup where g_id = #{g_id}")
    public  void  deleteGrowup(Integer g_id);
}


