package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.ChengJiu;

import java.util.List;

public interface ChengJiuService {
    //展示所有成就
    public List<ChengJiu> findAll(Integer u_id);

    //添加成就
    public void addChengJiu(ChengJiu chengJiu);
}
