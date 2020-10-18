<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加课程</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <center><h3>添加课程页面</h3></center>
    <form action="${pageContext.request.contextPath}/addViewCLassMembersServlet" method="post">
        <div class="form-group">
            <label for="mname">姓名：</label>
            <input type="text" class="form-control" id="mname" name="mname" placeholder="请输入会员姓名">
        </div>

        <div class="form-group">
            <label for="cname">课程：</label>
            <input type="text" class="form-control" id="cname" name="cname" placeholder="请输入课程名称"/>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-info" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回信息页面" onclick="JavaScript:history.go(-1)">
        </div>
    </form>
</div>
</body>
</html>