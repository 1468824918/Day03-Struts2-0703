<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/12
  Time: 下午5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录拦截器案例</title>
</head>
<body>
<h4>如果没有点击login,当点击add或者update时会跳转login.jsp页面</h4>
<h4>如果点击过login,当点击add或者update时会跳转到success.jsp页面</h4>
<a href="/inter/add_UI.action">add添加</a>
<a href="/inter/update_UI.action">update修改</a><br>
<a href="/inter/login_UI.action">login登录</a><br>
</body>
</html>
