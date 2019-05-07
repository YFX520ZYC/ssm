package com.qianfeng.ssm.service.impl;



import com.qianfeng.ssm.dao.UnfahuoDao;
import com.qianfeng.ssm.entity.Unfahuo;
import com.qianfeng.ssm.service.UnfahuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnfahuoServiceImpl implements UnfahuoService {

    @Autowired
    private UnfahuoDao unfahuoDao;


    @Override
    public List<Unfahuo> showAllUnfahuo(Integer id) {
      List<Unfahuo> list = unfahuoDao.showAll(id);
        return list;
    }
}
