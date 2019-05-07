package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.Unfahuo;

import java.util.List;

public interface UnfahuoService {

    //展示所有待发货
    public List<Unfahuo> showAllUnfahuo(Integer id);

}
