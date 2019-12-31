package com.qhit.dao.daoImpl;

import com.qhit.dao.BaseDao;
import com.qhit.dao.NewsUsersDao;
import com.qhit.entity.NewsUsers;
import sun.swing.BakedArrayList;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NewsUsersDaoImpl extends BaseDao implements NewsUsersDao {
    @Override
    public boolean islogin(String uname, String upwd) {
        boolean isflag = false;
        List<NewsUsers>list = new ArrayList();
        String sql = "select * from news_users where uname=? and upwd=?";
        Object[] obj={uname,upwd};
        ResultSet query = query(sql,obj);

        NewsUsers user = null;
        try {
            while (query.next()){
                user = new NewsUsers();
                user.setUid(query.getInt("uid"));
                user.getUname(query.getString("uname"));
                user.getUpwd(query.getString("upwd"));
                list.add(user);

            }

        }catch (Exception e){
            e.printStackTrace();

        }
        if (list.size()>0){
            isflag=true;
        }



        return isflag;






    }
}
