package com.qianfeng.ssm.entity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Order {

    private int o_id;
    private String goodsName;
    private double price;
    private String status;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createDate;
    private  int u_id;
}
