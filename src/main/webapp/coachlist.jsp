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
        function deleteCoach(id) {
            if (confirm("您确定要删除吗？")) {
                location.href = "${pageContext.request.contextPath}/delCoachServlet?id=" + id;
            }
        }
    </script>

</head>
<body>
<div class="container">
    <h3 style="text-align: center">教练信息列表</h3>
    <div style="float: left;">
        <form class="form-inline" action="${pageContext.request.contextPath}/findCoachByName" method="post">
            <div class="form-group">
                <label for="exampleInputName2">姓名</label>
                <input type="text" name="name" class="form-control" id="exampleInputName2">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>
    <div style="float: right;margin: 5px;">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/coachadd.jsp">添加课程</a>
        <a class="btn btn-danger" type="button" value="返回信息页面" onclick="JavaScript:history.go(-1)">返回上一界面</a>
        <%-- <a class="btn btn-primary" href="classadd.html">删除课程</a>--%>
    </div>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <%--<th><input type="checkbox"></th>--%>
            <th>编号</th>
            <th>名字</th>
            <th>性别</th>
            <th>年龄</th>
            <th>电话</th>
            <th>工资</th>
            <th>操作</th>
        </tr>

        <c:forEach items="${coach}" var="coach" varStatus="s">
        <tr>
                <%--<th><input type="checkbox"></th>--%>
            <td>${s.count}</td>
            <td>${coach.name}</td>
            <td>${coach.sex}</td>
            <td>${coach.age}</td>
            <td>${coach.phoneNumber}</td>
            <td>${coach.salary}</td>
            <td><a class="btn btn-default btn-sm"
                   href="${pageContext.request.contextPath}/findCoachServlet?id=${coach.id}">修改</a>&nbsp;
                <a class="btn btn-default btn-sm" href="javascript:deleteCoach(${coach.id});">删除</a></td>
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

