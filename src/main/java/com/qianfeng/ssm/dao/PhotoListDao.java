package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.PhotoList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PhotoListDao {

    @Select("SELECT * from photolist where u_id = #{u_id}")
    //展示所有照片
    public List<PhotoList> findAll(Integer u_id);

    //添加照片
    @Insert("insert into photolist (photo,time,u_id) VALUES (?,#{photo},#{time},#{u_id})")
    public int  addPhotoList(PhotoList photoList);

    //删除照片
    @Delete("delete from photolist where p_id=#{p_id}")
    public void deletephotolist(PhotoList photoList);
}
