package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.Unpay;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UnpayDao {

    //查询所有的待付款
    @Select("select * from unpay where u_id = #{u_id}")
    public List<Unpay> showAll(Integer id);
}
