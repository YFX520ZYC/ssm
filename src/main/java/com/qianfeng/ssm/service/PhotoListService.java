package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.PhotoList;

import java.util.List;

public interface PhotoListService {
    //展示所有照片
    public List<PhotoList> findAll(Integer u_id);

    //添加照片
    public int addPhotoList(PhotoList photoList);

    //删除照片
    public void deletePhotoList(PhotoList photoList);
 }
