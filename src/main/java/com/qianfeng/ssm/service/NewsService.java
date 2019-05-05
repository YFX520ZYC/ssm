package com.qianfeng.ssm.service;

import com.qianfeng.ssm.entity.News;

import java.util.List;


public interface NewsService {

    public List<News> queryListAll(Integer id);


    public void saveNews(News news);
}
