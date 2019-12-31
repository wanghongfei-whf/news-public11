package com.qhit.dao.daoImpl;

import com.qhit.dao.BaseDao;
import com.qhit.dao.NewsDao;
import com.qhit.entity.News;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NewsDaoImpl extends BaseDao implements NewsDao  {
    @Override
    public List<News> queryAllNews() {
        List<News> list = new ArrayList<>();
        String sql = "select * from news";
        ResultSet query = query(sql);
        News ne = null;


        try {
            while (query.next()){
                ne=new News();
                ne.setNsummary(query.getString("nsummary"));
                ne.setNtitle(query.getString("ntitle"));
                ne.setNpicPath(query.getString("npicPath"));
                ne.setNmodifydate(query.getDate("nmodifydate"));
                ne.setNcontent(query.getString("ncontent"));
                ne.setNcreateDate(query.getDate("ncreateDate"));
                ne.setNid(query.getInt("nid"));
                ne.setNtid(query.getInt("ntid"));
                ne.setNauthor(query.getString("nauthor"));
                list.add(ne);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
