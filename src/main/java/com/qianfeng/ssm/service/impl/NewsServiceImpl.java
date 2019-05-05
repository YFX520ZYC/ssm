package com.qianfeng.ssm.service.impl;

import com.qianfeng.ssm.dao.NewsDao;
import com.qianfeng.ssm.entity.News;
import com.qianfeng.ssm.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> queryListAll(Integer id) {
        List<News> news = newsDao.queryList(id);
        return news;
    }

    @Override
    public void saveNews(News news) {

        newsDao.save(news);
    }
}
