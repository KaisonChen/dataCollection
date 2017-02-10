<%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2016/12/31
  Time: 下午12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>

    <script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
</head>
<body>


<script type="text/javascript">
    window.onload=function(){

        window.location.href="<%=basePath%>bloglist";

    }
</script>
</body>
</html>
