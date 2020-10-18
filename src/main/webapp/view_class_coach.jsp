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
        function deleteUser(id) {
            if (confirm("您确定要删除吗？")) {
                location.href = "${pageContext.request.contextPath}/delViewClassMembersServlet?mname=" + mname;
            }
        }
    </script>

</head>
<body>
<div class="container">
    <h3 style="text-align: center">教练课程信息列表</h3>
    <div style="float: right;margin: 5px;">
        <%--<a class="btn btn-primary" href="${pageContext.request.contextPath}/vcmclassadd.jsp">添加信息</a>--%>
        <a class="btn btn-danger" type="button" value="返回信息页面" onclick="JavaScript:history.go(-1)">返回上一界面</a>
    </div>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>课程名称</th>
            <th>教练姓名</th>
            <%--<th>操作</th>--%>
        </tr>

        <c:forEach items="${viewClassCoach}" var="viewClassCoach">
        <tr>
            <td>${viewClassCoach.cname}</td>
            <td>${viewClassCoach.name}</td>
            <%--<td><a class="btn btn-default btn-sm" href="javascript:deleteUser(${viewClassMembers.mname});">删除</a></td>--%>
        <tr>
            </c:forEach>
            <nav class="nav">
                <a class="nav-link active" href="${pageContext.request.contextPath}/membersListServlet">查看会员信息</a>
                <a class="nav-link" href="${pageContext.request.contextPath}/classListServlet">查看课程信息</a>
                <a class="nav-link" href="${pageContext.request.contextPath}/coachListServlet">查看教练信息</a>
                <a class="nav-link" href="${pageContext.request.contextPath}/viewClassMembersServlet">查看会员课程信息</a>
                <a class="nav-link" href="${pageContext.request.contextPath}/viewClassCoachServlet">查看教练课程信息</a>
                <a class="nav-link disabled" href="${pageContext.request.contextPath}/login.jsp">退出系统</a>
            </nav>
    </table>
</div>
</body>
</html>
