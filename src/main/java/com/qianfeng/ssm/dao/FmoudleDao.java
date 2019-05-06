package com.qianfeng.ssm.dao;

import com.qianfeng.ssm.entity.Fmoudle;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FmoudleDao {

    @Select("select fm.cookname,fe.cookname from fmodule fm LEFT JOIN  fmodule fe on fm.mo_id = fe.mou_id")
    public List<Fmoudle> twoMoudle();
}
