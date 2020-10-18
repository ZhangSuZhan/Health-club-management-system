<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>健身俱乐部管理系统</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
    </script>
</head>
<body>
<%--<div align="center">--%>
<%--<a href="${pageContext.request.contextPath}/membersListServlet" style="text-decoration:none;font-size:30px">查询所有会员信息
</a>
<br>
<a href="${pageContext.request.contextPath}/classListServlet" style="text-decoration:none;font-size:30px">查询所有课程信息
</a>
<br>
<a href="${pageContext.request.contextPath}/viewClassMembersServlet" style="text-decoration:none;font-size:30px">查询所有会员课程信息
</a>--%>
<div class="page-header">
    <h1>健身俱乐部管理系统 <small>Hello World</small></h1>
</div>
<div class="panel panel-primary">
    <div class="panel-heading" style="text-decoration:none;font-size:17px">查询所有会员信息</div>
    <div class="panel-body">
        <a
                href="${pageContext.request.contextPath}/membersListServlet">进入
        </a>
    </div>
</div>
<div class="panel panel-success">
    <div class="panel-heading" style="text-decoration:none;font-size:17px">查询所有课程信息</div>
    <div class="panel-body">
        <a
                href="${pageContext.request.contextPath}/classListServlet">进入
        </a>
    </div>
</div>
<div class="panel panel-warning">
    <div class="panel-heading" style="text-decoration:none;font-size:17px">查询所有教练信息</div>
    <div class="panel-body">
        <a
                href="${pageContext.request.contextPath}/coachListServlet">进入
        </a>
    </div>
</div>
<div class="panel panel-info">
    <div class="panel-heading" style="text-decoration:none;font-size:17px">查询所有会员课程信息</div>
    <div class="panel-body">
        <a
                href="${pageContext.request.contextPath}/viewClassMembersServlet">进入
        </a>
    </div>
</div>
<div class="panel panel-danger">
    <div class="panel-heading" style="text-decoration:none;font-size:17px">查询所有教练课程信息</div>
    <div class="panel-body">
        <a
                href="${pageContext.request.contextPath}/viewClassCoachServlet">进入
        </a>
    </div>
</div>

<%--
</div>
--%>

</body>
</html>
