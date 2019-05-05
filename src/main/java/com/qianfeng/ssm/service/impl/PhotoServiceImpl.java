package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.PhotoDao;
import com.qianfeng.ssm.entity.Photo;
import com.qianfeng.ssm.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoDao photoDao;

    @Override
    public List<Photo> findAll(Integer id) {
        List<Photo> list = photoDao.findAll(id);

        return list;
    }
}
