<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加会员</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <center><h3>添加教练信息页面</h3></center>
    <form action="${pageContext.request.contextPath}/addCoachServlet" method="post">
        <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
        </div>

        <div class="form-group">
            <label>性别：</label>
            <input type="radio" name="sex" value="男" checked="checked"/>男
            <input type="radio" name="sex" value="女"/>女
        </div>

        <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄">
        </div>

        <div class="form-group">
            <label for="phoneNumber">Phone：</label>
            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="请输入电话号码"/>
        </div>

        <div class="form-group">
            <label for="salary">余额：</label>
            <input type="text" class="form-control" id="salary" name="salary" placeholder="请输入"/>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-success" type="reset" value="重置" />
            <input class="btn btn-info" type="button" value="返回信息页面" onclick="JavaScript:history.go(-1)">
        </div>
    </form>
</div>
</body>
</html>