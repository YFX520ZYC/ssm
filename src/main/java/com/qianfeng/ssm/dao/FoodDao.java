package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.Food;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FoodDao {

    //查加删

    @Select("select * from food where u_id = #{id}")
    public List<Food> findAll(int uid);

    @Insert("INSERT INTO food VALUES(null,#{name},#{namelist},#{section},#{picture},#{u_id})")
    public void addOne(Food food);

    @Delete("delete from food where id = #{id}")
    public void deleteOne(int id);
}
