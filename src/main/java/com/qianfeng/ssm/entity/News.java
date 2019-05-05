package com.qianfeng.ssm.entity;

import lombok.Data;

import java.util.Date;

@Data
public class News {

    private  Integer nid;
    private  String name;
    private  String comment;
     //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")   返回的格式
    // @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
     // jsonformat是将date转换为String
     // 而DatetimeFormat是将string转换为date
    private Date data;
    private Integer uid;
}
