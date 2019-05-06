package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.PhotoList;
import com.qianfeng.ssm.service.PhotoListService;
import com.qianfeng.ssm.vo.JsonBean;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class PhotoListController {
    @Autowired
    private PhotoListService photoListService;
    //展示所有照片
    @GetMapping("photolist/photolist.do")
    public JsonBean findAll(Integer u_id){
       List<PhotoList> list=photoListService.findAll(u_id);
        return JsonBean.setOK("展示所有照片",list);
    }

    //添加照片
    @RequestMapping("photolist/addphotolist.do")
    public JsonBean addPhotoList(String photo, @DateTimeFormat(pattern = "yyyy-MM-dd")Date time, Integer u_id){
        PhotoList photoList = new PhotoList();
        photoList.setPhoto(photo);
        photoList.setTime(time);
        photoList.setU_id(u_id);
        return JsonBean.setOK("照片添加成功",photoListService.addPhotoList(photoList));
    }

    //删除照片
    @RequestMapping("photolist/deletephotolist.do")
    public JsonBean deletePhotoList(PhotoList photoList){
        photoListService.deletePhotoList(photoList);
        return JsonBean.setOK("照片删除成功",null);
    }
}
