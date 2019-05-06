package com.qianfeng.ssm.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.util.Date;

@lombok.Data
public class Growup {
    private Integer id;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date data;
    private Integer size;
    private String detail;
    private Double height;
    private Double head;
    private  Double weight;
    private Integer u_id;
}
