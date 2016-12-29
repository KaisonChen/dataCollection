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
    <title>Title</title>


</head>
<body>
    <jsp:include page="../com/header.jsp"></jsp:include>

    <nav class="navbar navbar-default" role="navigation" style="background-color: transparent;border-color: transparent;">
        <div class="container">
            <div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">博文精粹</a></li>
                    <li><a href="#">碎言碎语</a></li>
                    <li><a href="#">个人日记</a></li>
                    <li><a href="#">相册展示</a></li>
                    <li><a href="#">学无止境</a></li>
                    <li><a href="#">留言板</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="main">
        <div class="container">
            <div class="row">
                <div class="panel01" style="background-color: transparent;">
                    <div class="tab-content">
                        <ol class="breadcrumb" style="font-size:17px; background-color: transparent;border-color: transparent;">
                            <li>
                                <a target="_blank" href="">首页</a></li>
                            <li>
                                <a target="_blank" href="/mainsite/nuggets/organizationShop.jsp">机构专柜</a></li>
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
                                            <div class="col-xs-3 br1 h132">
                                                <div class="media">
                                                    <a href="">
                                                        <img src="../images/photo/1.jpg" style="width: 240px; height: 175px;">
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="col-lg-8">
                                                <a>
                                                    <p>
                                                        最近看群里聊天聊得最火热的莫过于手机网站和html5这两个词。可能有人会问，这两者有什么关系呢？随着这移动互联 网快速发展的时代，尤其是4G时代已经来临的时刻，加上微软对"XP系统"不提供更新补丁、维护的情况下。 html5+css3也逐渐的成为新一代web前端技术.....
                                                    </p>
                                                </a>
                                            </div>
                                        </div>
                                    </li>

                                    <li>
                                        <div class="row pbm ptm">
                                            <div class="col-xs-4 br1 h132">
                                                <div class="media">
                                                    <input type="hidden" class="unitIds" value="" unit-type="3">
                                                    <a class="pull-left" href="" target="_blank">
                                                        <img class="media-object"  onerror="this.src=''" src="../images/photo/1.jpg" alt="">
                                                    </a>

                                                </div>
                                            </div>
                                            <div class="col-xs-8 br1 h132">
                                                <div class="media-body details">

                                                    <a href="" target="_blank"><h4 class="media-heading text-primary"><font color="red"></font>湖<font color="red"></font>北<font color="red"></font>伟<font color="red"></font>通<font color="red"></font>管<font color="red"></font>业<font color="red"></font>科<font color="red"></font>技<font color="red"></font>有<font color="red"></font>限<font color="red"></font>公<font color="red"></font>司<font color="red"></font></h4></a>

                                                    <p>业务范围:<span class="text-grey">塑料管道及管件</span></p>
                                                    <p>简介:<span class="text-grey">湖北伟通管业科技有限公司目前注册资本5018...</span></p>
                                                </div>
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
