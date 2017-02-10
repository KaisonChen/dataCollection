<%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2017/1/12
  Time: 下午3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.cdp.common.model.UserInfo" %>
<%
    UserInfo userInfo = (UserInfo) session.getAttribute("userinfo");
    if(userInfo == null){
        userInfo = new UserInfo();
    }
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/index.css"/>
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <%--<link rel="stylesheet" href="../css/bootstrap.css" />--%>
    <link rel="stylesheet" href="../css/style.css"/>
    <link rel="stylesheet" href="../css/public.css"/>
    <link rel="stylesheet" href="../css/style-center.css"/>
    <link rel="stylesheet" href="../css/icons.css"/>

    <script type="text/javascript" src="../js/pub_init.js"></script>
    <script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
    <%--<script type="text/javascript" src="../js/mymouse.js" id="mymouse"></script>--%>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>

    <style>
        body{background: 0;}
        .list-group-item{background-color: #EDEDF0;}
    </style>
</head>
<body>
<nav class="topbar bb1">
    <div class="container" style="line-height: 30px;">
        <span id="cur_time"></span>
        <div class="pull-right" data-position="bottom" id="nav-top-right">

            <ul class="nav navbar-nav">
                <li><a href="../com/index.jsp">首页</a></li>
                <li id="loginf"><a href="../user/login.jsp">登录</a></li>
                <li id="logint" style="display: none;"></li>
                <li id="logout" style="display: none;"><a href="../logout">退出</a></li>
                <%--<li><a>注册</a></li>--%>
            </ul>
        </div>
    </div>
</nav>
</body>

<script>

    setInterval("document.getElementById('cur_time').innerHTML = new Date().toLocaleString()",1000);

    $().ready(function(){
        var user_name = "<%=userInfo.getUsername() == null ? "" : userInfo.getUsername() %>";
        if(user_name != null && user_name != ""){
            $("#loginf").hide();
            $("#logint").show();
            $("#logout").show();
            $("#logint").append(user_name);
        }
    })
</script>
</html>
