package com.qianfeng.ssm.dao;


import com.qianfeng.ssm.entity.Photo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PhotoDao {

    //展示所有的照片
    @Select("SELECT * from photolist where u_id = #{uid} ORDER BY time asc")
    public List<Photo> findAll(Integer id);
}
