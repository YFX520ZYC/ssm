package com.qianfeng.ssm.dao;


import com.qianfeng.ssm.entity.Unfahuo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UnfahuoDao {

    //查询所有的待发货
    @Select("select * from unfahuo where u_id = #{u_id}")
    public List<Unfahuo> showAll(Integer id);
}
