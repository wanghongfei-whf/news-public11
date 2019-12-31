package com.qhit.controller;

import com.qhit.entity.News;
import com.qhit.service.NewsSercice;
import com.qhit.service.NewsUsersService;
import com.qhit.service.serviceimp.NewsServiceImpl;
import com.qhit.service.serviceimp.NewsUsersServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    NewsUsersService usersService = new NewsUsersServiceImp();
    NewsSercice newsSercice = new NewsServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String uname= request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        PrintWriter out = response.getWriter();

        boolean isLog=usersService.chexkLogin(uname,upwd);
        if (isLog){

            List<News>list=newsSercice.getAllNews();
            request.setAttribute("newsList",list);
            request.getRequestDispatcher("/admin1.jsp").forward(request,response);
        }else {
            out.write("<script>");
            out.write("alert('')");
            out.write("</script>");

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
