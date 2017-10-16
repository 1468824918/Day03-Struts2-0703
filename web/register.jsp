<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/12
  Time: 下午3:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/inter/login.action" method="post">
    用户名: <input type="text" name="username"><br>
    密码: <input type="password" name="password"><br>
    <input type="submit" value="注册">
    <input type="reset" value="重置">
</form>
<a href="/inter/register.action">注册</a>
</body>
</html>
