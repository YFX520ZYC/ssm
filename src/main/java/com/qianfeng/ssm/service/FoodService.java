package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.Food;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FoodService {

    public List<Food> findAllfFoot(int uid);

    public void addOneFoot(Food food);

    public void deleteOneFoot(int id);
}
