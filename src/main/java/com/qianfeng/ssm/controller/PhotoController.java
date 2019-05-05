package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Photo;
import com.qianfeng.ssm.service.PhotoService;
import com.qianfeng.ssm.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @GetMapping("my/photos.do")
    public JsonBean findAllPhoto(Integer u_id){
        List<Photo> list = photoService.findAll(u_id);
            return JsonBean.setOK("所有照片展示成功",list);


    }
}
