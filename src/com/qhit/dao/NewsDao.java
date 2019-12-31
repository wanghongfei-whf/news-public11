package com.qhit.dao;

import com.qhit.entity.News;

import java.util.List;

public interface NewsDao {
    //查询所有的新闻
    List<News>queryAllNews();
    
}
