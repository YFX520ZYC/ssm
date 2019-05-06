package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.PhotoListDao;
import com.qianfeng.ssm.entity.PhotoList;
import com.qianfeng.ssm.service.PhotoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoListServiceImpl implements PhotoListService {
    @Autowired
    private PhotoListDao photoListDao;
    @Override
    public List<PhotoList> findAll(Integer u_id) {
        List<PhotoList> list=photoListDao.findAll(u_id);
        return list;
    }

    @Override
    public int addPhotoList(PhotoList photoList) {
        return photoListDao.addPhotoList(photoList);
    }

    @Override
    public void deletePhotoList(PhotoList photoList) {
         photoListDao.deletephotolist(photoList);
    }
}
