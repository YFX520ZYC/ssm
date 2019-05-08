package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.QingJie;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface QingJieDao {


    @Select("select * FROM qingjie where RAND() LIMIT 6")
    public List<QingJie> selectAll();
}
