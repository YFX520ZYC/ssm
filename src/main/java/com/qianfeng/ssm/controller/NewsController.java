package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.News;
import com.qianfeng.ssm.service.NewsService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "消息",tags = "进行展示")
@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @ApiOperation(value = "所有消息的消息列表",notes = "展示所有信息内容")
    @GetMapping("news/newsList.do")
    public JsonBean queryNewsList(Integer u_id){
        List<News> news = newsService.queryListAll(u_id);
        return JsonBean.setOK("news展示",news);
    }

    //此时需要前台传过来一个id  用实体类new接收
    @ApiOperation(value = "添加",notes = "新增新的添加")
    @GetMapping("news/addNews.do")
    public JsonBean saveNews(News news){
        newsService.saveNews(news);
        return JsonBean.setOK("news新增",null);
    }
}
