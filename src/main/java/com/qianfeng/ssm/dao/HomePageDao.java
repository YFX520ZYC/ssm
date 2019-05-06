package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.HeadList;
import com.qianfeng.ssm.entity.HomePage;
import org.apache.ibatis.annotations.Select;
import org.hibernate.annotations.SelectBeforeUpdate;

import java.util.List;

public interface HomePageDao {


    @Select("select * from homepage order by rand() limit 3")
    List<HomePage> queryThreedALL();

    @Select("select * from headlist order by rand() limit 1")
   HeadList queryOne();
}
