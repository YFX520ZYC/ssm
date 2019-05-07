package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.AttenList;
import com.qianfeng.ssm.entity.Attention;
import com.qianfeng.ssm.vo.JsonBean;

import java.util.List;

public interface AttenListService {

    public List<AttenList> findByAll(int id);

    //public List<AttenList> likeall(Attention attention);

    public JsonBean likeall(Attention attention);
}
