package com.qianfeng.ssm.service.impl;




import com.qianfeng.ssm.dao.FoodDao;
import com.qianfeng.ssm.entity.Food;
import com.qianfeng.ssm.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDao foodDao;

    @Override
    public List<Food> findAllfFoot(int uid) {
        List<Food> list = foodDao.findAll(uid);
        return list;
    }

    @Override
    public void addOneFoot(Food food) {
      foodDao.addOne(food);
    }

    @Override
    public void deleteOneFoot(int id) {
        foodDao.deleteOne(id);
    }
}
