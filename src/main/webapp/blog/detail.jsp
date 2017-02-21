<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2016/12/27
  Time: 下午4:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog Detail</title>
    <script type="text/javascript" src="../js/bootstrap-paginator.js"></script>

</head>
<body>
<jsp:include page="../com/header.jsp"></jsp:include>

<nav class="navbar navbar-default" role="navigation" style="background-color: transparent;border-color: transparent;">
    <div class="container">
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="../bloglist">博文精粹</a></li>
                <%--<li><a href="#">碎言碎语</a></li>
                <li><a href="#">个人日记</a></li>--%>
                <li><a href="../blog/photos.jsp">相册展示</a></li>
                <li><a href="../blog/plan.jsp">学无止境</a></li>
                <li><a href="#">留言板</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="main">
    <div class="container">
        <div class="row col-xs-10">
            <div class="panel01" style="background-color: transparent;">
                <div class="tab-content">
                    <ol class="breadcrumb" style="font-size:17px; background-color: transparent;border-color: transparent;">
                        <li>
                            <a href="../bloglist">首页</a></li>
                        <li>
                            <a href="">博文精粹</a></li>
                    </ol>
                </div>
            </div>
            <div class="panel01" >
                <div class="panel01-body">
                    <ul class="list-unstyled list01">
                        <div class="p_org_list">
                            <ul class="list-unstyled list01">

                                    <li>
                                        <div class="row pbm ptm">

                                            <div class="col-lg-12">

                                                <h4 class="media-heading" style="text-align: center;">${blogdetail.title}</h4>
                                                   <p class="text-grey">
                                                       <span><strong>${blogdetail.author}</strong>&nbsp;&nbsp;&nbsp;</span>
                                                       <span class="time">${blogdetail.create_time}</span>
                                                   </p>
                                                    <pre style="white-space: pre-wrap;word-wrap: break-word;margin-top: -10px;">${blogdetail.body}
                                                    </pre>
                                            </div>
                                        </div>
                                    </li>


                            </ul>
                        </div>
                    </ul>
                </div>
            </div>
        </div>


    </div>
</div>



</body>


</html>
