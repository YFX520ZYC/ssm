package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface NewsDao {

    @Select("select * from news where u_id = #{id} ORDER BY DATA desc")
    public List<News> queryList(Integer id);

    @Insert("INSERT into news VALUES(null,#{name},#{comment},now(),#{u_id})")
    public void save(News news);
}
