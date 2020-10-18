<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改课程信息</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">修改课程信息</h3>
    <form action="${pageContext.request.contextPath}/updateClassesServlet" method="post">
        <input type="hidden" name="id" value="${classes.id}">
        <div class="form-group">
            <label for="cname">名称：</label>
            <input type="text" class="form-control" id="cname" name="cname" value="${classes.cname}"
                   placeholder="请输入名称"/>
        </div>

        <div class="form-group">
            <label for="price">价格：</label>
            <input type="text" class="form-control" value="${classes.price}" id="price" name="price"
                   placeholder="请输入价格"/>
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