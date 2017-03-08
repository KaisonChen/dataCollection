<%@ page import="com.cdp.blog.model.PlaUser" %><%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2017/1/12
  Time: 下午3:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    PlaUser plaUser = (PlaUser) session.getAttribute("userinfo");
    if(plaUser == null){
        plaUser = new PlaUser();
    }
%>
<html>
<head>
    <title>User</title>
</head>
<body>
    <jsp:include page="../user/header.jsp"></jsp:include>

    <div class="main">
        <div class="container" style="margin-left: 10px;">
            <div class="row">
                <div class="col-xs-2" style="height: 100%;background-color: #EDEDF0;">
                    <div class="media">
                        <img src="../images/photo/1.jpg">
                    </div>
                    <div class="p_org_list">
                        <ul class="list-unstyled list-group  mbn text-center fontM">
                            <li class="list-group-item"><a href="#">&nbsp;</a></li>
                            <li class="list-group-item"><a href="../user/userInfo.jsp">我的基本信息</a></li>
                            <li class="list-group-item"><a href="../userBlogList">我的文章</a></li>
                            <li class="list-group-item"><a href="#">我的碎言碎语</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-xs-10 prn">
                    <div class="t_companyInfor">
                        <span class="t_information">个人信息</span>
                    </div>
                    <div class="row t_detailInfor">
                        <div class="col-xs-6">
                            <b>用户名：</b><%=plaUser.getPlaUserNickname()%>
                        </div>
                        <div class="col-xs-6">

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
