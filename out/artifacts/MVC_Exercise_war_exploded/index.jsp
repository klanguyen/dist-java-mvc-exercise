<%--
  Created by IntelliJ IDEA.
  User: bitstudent
  Date: 9/18/2019
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% String path = request.getContextPath();%>
<a href="<%=path%>/Controller?page=about" name="params">About</a>
<a href="Controller?page=signUp" name="params">Sign Up</a>
<a href="Controller?page=login" name="params">Log In</a>
</body>
</html>
