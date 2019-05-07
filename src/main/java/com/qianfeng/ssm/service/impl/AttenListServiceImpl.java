package com.qianfeng.ssm.service.impl;



import com.qianfeng.ssm.dao.AttenListDao;
import com.qianfeng.ssm.entity.AttenList;
import com.qianfeng.ssm.entity.Attention;
import com.qianfeng.ssm.service.AttenListService;
import com.qianfeng.ssm.vo.JsonBean;
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


    @Override
    public JsonBean likeall(Attention attention) {

        Attention atten = attenListDao.queryAll(attention.getAttenid());

        if (atten != null){
            attenListDao.deleteById(attention.getAttenid());
            List<AttenList> list = attenListDao.findAll(attention.getU_id());
            return JsonBean.setOK("取消关注，展示所有",list);
        }else{
            attenListDao.save(attention);
            List<AttenList> list = attenListDao.findAll(attention.getU_id());
            return JsonBean.setOK("添加关注，展示所有",list);
        }

    }


    /*@Override
    public List<AttenList> likeall(Attention attention) {
        Attention atten = attenListDao.queryAll(attention.getAttenid());
        if (atten != null){
            attenListDao.deleteById(attention.getAttenid());

            return attenListDao.findAll(attention.getU_id());
        }else{
            attenListDao.save(attention);
            return attenListDao.findAll(attention.getU_id());
        }

    }*/






}
