package com.qhit.service.serviceimp;

import com.qhit.dao.NewsDao;
import com.qhit.dao.daoImpl.NewsDaoImpl;
import com.qhit.entity.News;
import com.qhit.entity.NewsUsers;
import com.qhit.service.NewsSercice;

import java.util.List;

public class NewsServiceImpl implements NewsSercice {

    NewsDao newsDao = new NewsDaoImpl();

    @Override
    public List<News> getAllNews() {
        return newsDao.queryAllNews() ;
    }
}
