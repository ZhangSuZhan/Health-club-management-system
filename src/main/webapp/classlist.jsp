<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>健身俱乐部管理系统</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>

    <script>
        function deleteClasses(id) {
            if (confirm("您确定要删除吗？")) {
                location.href = "${pageContext.request.contextPath}/delClassesServlet?id=" + id;
            }
        }
    </script>

</head>
<body padding-top: 70px;>
<div class="container">
    <h3 style="text-align: center">课程信息列表</h3>
    <div style="float: left;">
        <form class="form-inline" action="${pageContext.request.contextPath}/findClassByName" method="post">
            <div class="form-group">
                <label for="exampleInputName2">名称</label>
                <input type="text" name="cname" class="form-control" id="exampleInputName2">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>
    <div style="float: right;margin: 5px;">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/classadd.jsp">添加课程</a>
        <a class="btn btn-danger" type="button" value="返回信息页面" onclick="JavaScript:history.go(-1)">返回上一界面</a>
        <%-- <a class="btn btn-primary" href="classadd.html">删除课程</a>--%>
    </div>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <%--<th><input type="checkbox"></th>--%>
            <th>编号</th>
            <th>名称</th>
            <th>价格</th>
            <th>操作</th>
        </tr>

        <c:forEach items="${classes}" var="classes" varStatus="s">
        <tr>
                <%--<th><input type="checkbox"></th>--%>
            <td>${s.count}</td>
            <td>${classes.cname}</td>
            <td>${classes.price}</td>
            <td><a class="btn btn-default btn-sm"
                   href="${pageContext.request.contextPath}/findClassesServlet?id=${classes.id}">修改</a>&nbsp;
                <a class="btn btn-default btn-sm" href="javascript:deleteClasses(${classes.id});">删除</a></td>
        <tr>
            </c:forEach>
            <nav class="navbar navbar-text navbar-fixed-bottom" style="font-size: 20px">
                <div class="container" style="text-align: center">
                    <a class="nav-link active" href="${pageContext.request.contextPath}/membersListServlet">查看会员信息</a>
                    <a class="nav-link" href="${pageContext.request.contextPath}/classListServlet">查看课程信息</a>
                    <a class="nav-link" href="${pageContext.request.contextPath}/coachListServlet">查看教练信息</a>
                    <a class="nav-link" href="${pageContext.request.contextPath}/viewClassMembersServlet">查看会员课程信息</a>
                    <a class="nav-link" href="${pageContext.request.contextPath}/viewClassCoachServlet">查看教练课程信息</a>
                    <a class="nav-link disabled" href="${pageContext.request.contextPath}/login.jsp">退出系统</a>
                </div>
            </nav>
    </table>
</div>
</body>
</html>

