package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.Growup;

import java.util.List;

public interface GrowupService {
    //展示所有成长记录
    public List<Growup> findAll(Integer u_id);

    //添加成长记录
    public void addGrowup(Growup growup);
    //删除成长记录
    public void  deleteGrowup(Integer g_id);
}
