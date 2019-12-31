package com.qhit.dao;



import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.swing.*;
import javax.swing.plaf.basic.ComboPopup;
import java.sql.*;

public class BaseDao {

    private static ComboPooledDataSource dataSource=new ComboPooledDataSource("c3p0-config.xml");
    static Connection conn=null;
    static {

        try {
            conn=dataSource.getConnection();
            if(conn!=null){
                System.out.println("数据库连接成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//建立查询语句盒子

    public ResultSet query(String sql,Object...params){
        ResultSet rs=null;
        //sql=  "select * from news_users where name=? and age=? and sex=?";
        try {
            PreparedStatement st=conn.prepareStatement(sql);
            for(int i=0;i<params.length;i++){
                st.setObject(i+1,params[i]);
            }
            rs= st.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }


    /**
     * 增 删  改
     * @param sql 传入需要执行的sqi
     * @param params 传入执行sql语句是所需要的参数
     * @return 返回一个结果集
     */
    public int upda(String sql,Object...params){
        int rs=0;

        try {
            PreparedStatement st=conn.prepareStatement(sql);
            for(int i=0;i<params.length;i++){
                System.out.println(params[i]);
                st.setObject(i+1,params[i]);
            }
            rs= st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return rs;
    }

    public static void main(String[] args) {


    }

}