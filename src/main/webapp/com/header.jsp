<%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2016/12/28
  Time: 上午10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <link rel="stylesheet" href="../css/index.css"/>
    <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <link rel="stylesheet" href="../css/style.css"/>
    <link rel="stylesheet" href="../css/public.css"/>

    <script type="text/javascript" src="../js/pub_init.js"></script>
    <script type="text/javascript" src="../js/jquery1.42.min.js"></script>
    <script type="text/javascript" src="../js/mymouse.js" id="mymouse"></script>
</head>
<body>
<nav class="topbar bb1">
    <div class="container" style="line-height: 30px;">
        <span id="cur_time"></span>
        <div class="pull-right" data-position="bottom" id="nav-top-right">
            <ul class="nav navbar-nav">
                <li><a>登录</a></li>
                <li><a>注册</a></li>
            </ul>
        </div>
    </div>
</nav>
    <div style="margin-left: 15%;">
        <div><h3>三生石上忘三生</h3></div>
        <div style="margin-left: -5%;">
            <p>青春是打开了,就合不上的书。人生是踏上了，就回不了头的路，爱情是扔出了，就收不回的赌注。</p>，
        </div>
    </div>



</body>
<script>

    setInterval("document.getElementById('cur_time').innerHTML = new Date().toLocaleString()",1000);
</script>
</html>
