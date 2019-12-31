

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <title>添加主题--管理后台</title>
    <link href="./css/admin.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="header">
    <div id="welcome">欢迎使用新闻管理系统！</div>
    <div id="nav">
        <div id="logo"><img src="/images/logo.jpg" alt="新闻中国"></div>
        <div id="a_b01"><img src="/images/a_b01.gif" alt=""></div>
    </div>
</div>
<div id="admin_bar">
    <div id="status">管理员： 登录  &nbsp;&nbsp;&nbsp;&nbsp; <a href="http://localhost:8080/newspages/admin.jsp#">login out</a></div>
    <div id="channel"> </div>
</div>
<div id="main">
    <div id="opt_list">
        <ul>
            <li><a href="http://localhost:8080/util/news?opr=toAddNews">添加新闻</a></li>
            <li><a href="http://localhost:8080/util/news?opr=list">编辑新闻</a></li>
            <li><a href="http://localhost:8080/newspages/topic_add.jsp">添加主题</a></li>
            <li><a href="http://localhost:8080/util/topics?opr=list">编辑主题</a></li>
        </ul>
    </div>

    <div id="opt_area">

        <ul class="classlist">
            <c:forEach items="${newsList}" var="news">
                <li>${news.ntitle}<span> 作者： &nbsp;&nbsp;&nbsp;&nbsp;${news.nauthor}
<a href="http://localhost:8080/util/news?opr=toModifyNews&amp;nid=186">修改</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="javascript:;" onclick="return clickdel(186)">删除</a></span> </li>
            </c:forEach>

        </ul>
        <c:forEach begin="1" end="">



        </c:forEach>



    </div>
</div>
<div id="footer">
    <div id="site_link"> <a href="http://localhost:8080/newspages/admin.jsp#">关于我们</a><span>|</span> <a href="http://localhost:8080/newspages/admin.jsp#">Aboue Us</a><span>|</span> <a href="http://localhost:8080/newspages/admin.jsp#">联系我们</a><span>|</span> <a href="http://localhost:8080/newspages/admin.jsp#">广告服务</a><span>|</span> <a href="http://localhost:8080/newspages/admin.jsp#">供稿服务</a><span>|</span> <a href="http://localhost:8080/newspages/admin.jsp#">法律声明</a><span>|</span> <a href="http://localhost:8080/newspages/admin.jsp#">招聘信息</a><span>|</span> <a href="http://localhost:8080/newspages/admin.jsp#">网站地图</a><span>|</span> <a href="http://localhost:8080/newspages/admin.jsp#">留言反馈</a> </div>
    <div >
        <p class="">24小时客户服务热线：010-68988888  &nbsp;&nbsp;&nbsp;&nbsp; <a href="http://localhost:8080/newspages/admin.jsp#">常见问题解答</a> &nbsp;&nbsp;&nbsp;&nbsp;  新闻热线：010-627488888<br>
            文明办网文明上网举报电话：010-627488888  &nbsp;&nbsp;&nbsp;&nbsp;  举报邮箱：<a href="http://localhost:8080/newspages/admin.jsp#">jubao@jb-aptech.com.cn</a></p>
        <p class="copyright">Copyright © 1999-2009 News China gov, All Right Reserver<br>
            新闻中国   版权所有</p>
    </div>


</div>



</body>
</html>
