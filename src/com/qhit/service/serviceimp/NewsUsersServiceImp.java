package com.qhit.service.serviceimp;

import com.qhit.dao.NewsUsersDao;
import com.qhit.dao.daoImpl.NewsUsersDaoImpl;
import com.qhit.service.NewsUsersService;

public class NewsUsersServiceImp implements NewsUsersService{
    NewsUsersDao usersDao = new NewsUsersDaoImpl();

    @Override
    public boolean chexkLogin(String uname, String upwd) {
        return usersDao.islogin(uname,upwd);
    }
}
