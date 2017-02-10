<%@ page import="org.omg.CORBA.Request" %><%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2017/1/5
  Time: 下午2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String randomString = (String)session.getAttribute("randomString");
    String rand = (String)request.getSession().getAttribute("randomString");
%>
<html>
<head>
    <title>LOGIN</title>

    <link rel="stylesheet" href="../css/bootstrap-theme.min.css"/>
    <link rel="stylesheet" href="../css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../css/style.css"/>

    <script type="text/javascript" src="../js/mymouse.js" id="mymouse"></script>
    <script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>

    <style>
        body{font-size:14px;font-family:"微软雅黑";background:#E3E3E5 url(../images/bg.jpg) 50% top scroll no-repeat;color:#5d5d5d;}

        #loginDiv{margin:0 auto;border:0px solid #000;}
    </style>
</head>
<body>
<nav class="topbar bb1">
    <div class="container" style="line-height: 30px;">
        <span id="cur_time"></span>
        <div class="pull-right" data-position="bottom" id="nav-top-right">

            <ul class="nav navbar-nav">
                <li><a href="../bloglist">首页</a></li>
            </ul>
        </div>
    </div>
</nav>
      <div class="main">
          <div class="container">
              <div class="row" id="loginDiv" style="width: 30%;margin-top:20%;text-align: center;">
                  <p style="color: red;">${message}</p>
                  <form action="/login" onsubmit="return doVaild()">
                      <div class="row">
                          <label class="col-xs-3 control-label">用户名</label>
                          <div class="col-xs-9">
                              <input class="col-xs-10" type="text" id="user_name" name="user_name"/>
                          </div>
                      </div>

                      <div class="row" style="margin-top: 20px;">
                          <label class="col-xs-3 control-label">密码</label>
                          <div class="col-xs-9">
                              <input class="col-xs-10" type="password" id="user_pwd" name="user_pwd"/>
                          </div>
                      </div>

                      <div class="row" style="margin-top: 20px;">
                          <label class="col-xs-3 control-label">验证码</label>
                          <div class="col-xs-9">
                              <input type="text" id="captcha" name="captcha" maxlength="10" style="width: 100px;float: left;"/>
                              <img id="captchaImage" src="../captcha"/>
                          </div>
                      </div>

                      <div class="row" style="margin-top: 20px;">
                            <div class="col-xs-6">
                                <input type="submit" class="btn btn-sm btn-info" value="登录">
                            </div>
                            <div class="col-xs-6">
                                <a  class="btn btn-sm btn-info" href="">注册</a>
                            </div>
                      </div>
                  </form>
              </div>
          </div>
      </div>
</body>
<script>

    setInterval("document.getElementById('cur_time').innerHTML = new Date().toLocaleString()",1000);

    // 更换验证码
    $('#captchaImage').click(function()
    {
        $('#captchaImage').attr("src", "../captcha?timestamp=" + (new Date()).valueOf());
    });
</script>

<script>
function doVaild() {
    var user_name = $("#user_name").val();
    var user_pwd = $("#user_pwd").val();
    var captcha = $("#captcha").val();

    if(user_name == null || user_name == '' || user_pwd == null || user_pwd == ''){
        alert("请输入用户名和密码");
        return false;
    }
    if(captcha == null || captcha == ''){
        alert("请输入验证码！");
        return false;
    }
    return true;
}

</script>
</html>
