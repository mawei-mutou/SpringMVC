<%--
  Created by IntelliJ IDEA.
  User: 姚东
  Date: 2020/5/24
  Time: 15:53
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
    <title>Title</title>
</head>
<body>
<a href="demo01?demo=demo01">demo01</a>
<a href="demo02?demo=demo02">demo02</a>
</body>
</html>
