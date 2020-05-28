<%--
  Created by IntelliJ IDEA.
  User: 姚东
  Date: 2020/5/25
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录页面</title>
</head>
<body>
<form method="post" action="demo6">
    姓名：<input type="text" name="peo[0].name"><br>
    年龄：<input type="text" name="peo[0].age"><br/>
    姓名：<input type="text" name="peo[1].name"><br>
    年龄：<input type="text" name="peo[1].age"><br/>
    <input type="submit" value="提交">
    <input type="checkbox" name="hover" value="看书">
    <input type="checkbox" name="hover" value="学习">
    <input type="checkbox" name="hover" value="打游戏">
    <input type="checkbox" name="hover" value="运动">

</form>
<a href="demo8/姚东/27">跳转</a>
</body>
</html>
