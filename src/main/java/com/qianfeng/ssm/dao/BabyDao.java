package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.Baby;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BabyDao {

    @Select("select * from baby where u_id=#{id}")
   public List<Baby> findAll(Integer id);

}
