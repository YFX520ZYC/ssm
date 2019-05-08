package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.Baby;

import java.util.List;

public interface BabyService {

    public List<Baby> findAllBaby(Integer id);
}
