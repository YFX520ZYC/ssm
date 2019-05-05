package com.qianfeng.ssm.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Photo {

    private  Integer pid;
    private  String photo;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date  time;
    private Integer uid;

}
