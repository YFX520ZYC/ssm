package com.qianfeng.ssm.vo;

import lombok.Data;

@Data
public class JsonBean {

    private int code;
    private Object data;
    private String msg;

    public static  JsonBean setOK(String msg,Object data){

       JsonBean jb =  new JsonBean();
       jb.setCode(1000);
       jb.setData(data);
       jb.setMsg(msg+"已经成功");
       return  jb;
    }

    public static  JsonBean setError(String msg,Object data){

        JsonBean jb =  new JsonBean();
        jb.setCode(1001);
        jb.setData(data);
        jb.setMsg(msg+"已经失败");
        return  jb;
    }

}
