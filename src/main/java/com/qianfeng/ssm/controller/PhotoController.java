package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Photo;
import com.qianfeng.ssm.service.PhotoService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "云相册",tags = "云相册")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @ApiOperation(value = "展示所有照片",notes = "展示所有照片")
    @GetMapping("my/photos.do")
    public JsonBean findAllPhoto(Integer u_id){
        List<Photo> list = photoService.findAll(u_id);
            return JsonBean.setOK("所有照片展示成功",list);


    }
}
