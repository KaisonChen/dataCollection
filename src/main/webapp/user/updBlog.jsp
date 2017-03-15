<%--
  Created by IntelliJ IDEA.
  User: xiaohu
  Date: 2017/1/12
  Time: 下午3:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                        <li class="list-group-item active"><a href="../userBlogList">我的文章</a></li>
                        <li class="list-group-item"><a href="#">我的碎言碎语</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-xs-10">
                <div class="">
                    <div class="t_companyInfor" style="margin-bottom:0px;">
                        <span class="t_information">我的文章</span>
                        <button class="t_edit R orangebg" style="float:right;width: 69px;height: 27px" onclick="window.location = ''">
                            <a href="javascript:void(0);" style="color: white"><i class="icon-edit whiteFont"></i>添&nbsp;加</a>
                        </button>
                    </div>
                    <div class="tab-content">
                        <div class="panel01-body" style="padding-bottom:0px;">
                            <div class="row">
                                <div class="col-xs-12">
                                    <div style="line-height:30px;padding-bottom:0px;">
                                        <div class="input-group t_searchBox" style="float:right; margin-top:-10px;">
                                            <input class="form-control" id="searchKey" type="text" placeholder="请输入文章名称" value="">
                                            <span class="input-group-btn"><button class="btn btn-sm btn-primary t_searchBtn" onclick="search();" type="button"><i class="icon icon-search-w"></i></button></span>
                                        </div>

                                        <div class="tab-pane fade in active panel01-body">
                                            <div class="t_resource" id="trade_list">
                                                <div style="text-align:center; margin-top:30px;">
                                                    <div class="favorites_list_div">
                                                        <div class="t_resource">
                                                            <%--<table class="table table-bordered  table-hover">
                                                                <thead class="t_thead">
                                                                <tr class="info">
                                                                    <td>文章名称</td>
                                                                    <td>创建时间</td>
                                                                    <td>修改时间</td>
                                                                    <td>操作</td>
                                                                </tr>
                                                                <c:forEach items="${blogList}" var="blog" varStatus="varStatus">

                                                                <tr <c:if test="${varStatus.index % 2 != 0}">style='background:#ECF6EE;'</c:if>>
                                                                    <td>${blog.plaBlogTitle}</td>
                                                                    <td><fmt:formatDate value="${blog.createTime}" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate></td>
                                                                    <td><fmt:formatDate value="${blog.updTime}" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate></td>
                                                                    <td>
                                                                        <a href="/updateBlog?blogId=${blog.plaBlogId}">修改</a>
                                                                        /
                                                                        <a href="/deleteBlog?blogId=${blog.plaBlogId}>删除</a></td>
                                                                    </tr>
                                                                </c:forEach>
                                                                </thead>
                                                            </table>--%>
                                                            <div class="col-xs-1"></div>
                                                                <form action="/updateBlog" method="post">
                                                                    <div class="col-xs-10">
                                                                        <input type="hidden" name="plaBlogId" value="${blogdetail.plaBlogId}">
                                                                        <div>
                                                                            <button type="submit" class="btn-sm">保存</button>
                                                                            <input type="text" style="width: 300px;" name ="plaBlogTile" value="${blogdetail.plaBlogTitle}">
                                                                        </div>
                                                                        <br>
                                                                        <div style="height: auto;">
                                                                            <textarea name="plaBlogBody"  style="width:100%;height:100%; overflow-x: auto; overflow-y: auto;">
                                                                                ${blogdetail.plaBlogBody}
                                                                            </textarea>
                                                                        </div>
                                                                    </div>
                                                                </form>
                                                            <div class="col-xs-1"></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
