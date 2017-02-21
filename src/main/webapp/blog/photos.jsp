<%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2017/2/13
  Time: 下午2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Photos</title>

</head>
<body>
    <jsp:include page="../com/header.jsp"></jsp:include>
    <nav class="navbar navbar-default" role="navigation" style="background-color: transparent;border-color: transparent;">
        <div class="container">
            <div>
                <ul class="nav navbar-nav">
                    <li><a href="../bloglist">博文精粹</a></li>
                    <%--<li><a href="#">碎言碎语</a></li>
                    <li><a href="#">个人日记</a></li>--%>
                    <li class="active"><a href="#">相册展示</a></li>
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
                                <a href="">相册展示</a></li>
                        </ol>
                    </div>
                </div>
                <div class="panel01" >
                    <div class="panel01-body">
                        <ul class="list-unstyled list01">
                            <div class="p_org_list">
                                <p>暂时并没有什么照片！</p>
                            </div>
                        </ul>
                    </div>
                </div>
            </div>


        </div>
    </div>
</body>
</html>
