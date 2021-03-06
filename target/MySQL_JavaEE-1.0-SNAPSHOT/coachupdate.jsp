<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改教练信息</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">修改教练信息</h3>
    <form action="${pageContext.request.contextPath}/updateCoachServlet" method="post">
        <input type="hidden" name="id" value="${coach.id}">
        <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name" value="${coach.name}"
                   placeholder="请输入姓名"/>
        </div>

        <div class="form-group">
            <label>性别：</label>
            <c:if test="${coach.sex == '男'}">
                <input type="radio" name="sex" value="男" checked/>男
                <input type="radio" name="sex" value="女"/>女
            </c:if>

            <c:if test="${coach.sex == '女'}">
                <input type="radio" name="sex" value="男"/>男
                <input type="radio" name="sex" value="女" checked/>女
            </c:if>

        </div>

        <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" value="${coach.age}" id="age" name="age" placeholder="请输入年龄"/>
        </div>

        <div class="form-group">
            <label for="phoneNumber">Phone：</label>
            <input type="text" id="phoneNumber" class="form-control" value="${coach.phoneNumber}" name="phoneNumber"
                   placeholder="请输入电话号码"/>
        </div>

        <div class="form-group">
            <label for="salary">余额：</label>
            <input type="text" id="salary" class="form-control" value="${coach.salary}" name="salary"
                   placeholder="请输入工资金额"/>
        </div>
        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交"/>
            <input class="btn btn-success" type="reset" value="重置"/>
            <input class="btn btn-info" type="button" value="返回信息页面" onclick="JavaScript:history.go(-1)">
        </div>
    </form>
</div>
</body>
</html>