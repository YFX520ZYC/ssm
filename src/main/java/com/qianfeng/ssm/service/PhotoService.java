package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.Photo;

import java.util.List;

public interface PhotoService {

    //我的：展示所有的照片
   public List<Photo> findAll(Integer id);
}
