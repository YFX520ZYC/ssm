package com.qianfeng.ssm.service.impl;



import com.qianfeng.ssm.dao.AttenListDao;
import com.qianfeng.ssm.entity.AttenList;
import com.qianfeng.ssm.service.AttenListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttenListServiceImpl implements AttenListService {
    @Autowired
    private AttenListDao attenListDao;


    @Override
    public List<AttenList> findByAll(int id) {
        List<AttenList> list = attenListDao.findAll(id);
        return list;
    }

   /* @Override
    //关注后展示所有。
    public List<AttenList> findAll(int u_id, int attenid) {
        List<AttenList> list = attenListDao.findAll(u_id, attenid);
        if(list!=null && list.size() > 0){
           //如果已经关注，再点就是取消关注。
            attenListDao.deleteById(attenid);
        }else{
            //如果没有关注，则进行关注。
            attenListDao.addAtten(AttenList);
        }
        List<AttenList> list2 = attenListDao.findAll(u_id);
        return list2;
    }*/
}
