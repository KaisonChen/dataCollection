<%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2016/12/28
  Time: 上午10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cdp.blog.model.PlaUser" %>
<%
    PlaUser userInfo = (PlaUser) session.getAttribute("userinfo");
    if(userInfo == null){
        userInfo = new PlaUser();
    }
%>
<html>
<head>
    <link rel="stylesheet" href="../css/index.css"/>
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <%--<link rel="stylesheet" href="../css/bootstrap.css" />--%>
    <link rel="stylesheet" href="../css/style.css"/>
    <link rel="stylesheet" href="../css/public.css"/>

    <script type="text/javascript" src="../js/pub_init.js"></script>
    <script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="../js/mymouse.js" id="mymouse"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <%--<script type="text/javascript" src="../js/bootstrap-paginator.js"></script>--%>
</head>
<body>
<nav class="topbar bb1">
    <div class="container" style="line-height: 30px;">
        <span id="cur_time"></span>
        <div class="pull-right" data-position="bottom" id="nav-top-right">

            <ul class="nav navbar-nav">
                <%--<li id="loginf"><a href="../user/login.jsp">登录</a></li>--%>
                <li id="" style="display: none;"><a id="logint"></a></li>
                <li id="logout" style="display: none;"><a href="../logout">退出</a></li>
                <%--<li><a>注册</a></li>--%>
            </ul>
        </div>
    </div>
</nav>
    <div style="margin-left: 15%;">
        <div><h3>三生石上忘三生</h3></div>
        <div style="margin-left: -5%;">
            <p>青春是打开了,就合不上的书。人生是踏上了，就回不了头的路，爱情是扔出了，就收不回的赌注。</p>
        </div>
    </div>



</body>
<script>

    setInterval("document.getElementById('cur_time').innerHTML = new Date().toLocaleString()",1000);

    $().ready(function(){
        var user_name = "<%=userInfo.getPlaUserNickname() == null ? "" : userInfo.getPlaUserNickname() %>";
        if(user_name != null && user_name != ""){
            $("#loginf").hide();
            $("#logint").show();
            $("#logout").show();
            $("#logint").append(user_name);
        }
    })
</script>

</html>
