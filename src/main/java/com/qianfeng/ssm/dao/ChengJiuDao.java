package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.ChengJiu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ChengJiuDao {

    //展示所有成就
    @Select("select * from chengjiu where u_id = #{u-id}")
    public List<ChengJiu> finaAll(Integer u_id);

    //添加成就
    @Insert("insert into chengjiu (cname,cnamelist,u_id) values(#{cname},#{cnamelist},#{u_id})")
    public void addChengJiu(ChengJiu chengJiu);

}
