package com.qianfeng.ssm.entity;

import jdk.nashorn.internal.ir.LiteralNode;
import lombok.Data;

import java.util.Date;

@Data
public class AttenList {

    private int id;
    private String name;
    private Date time;
    private String neirong;
    private int like;
    private int attenid;
    private int u_id;

}
