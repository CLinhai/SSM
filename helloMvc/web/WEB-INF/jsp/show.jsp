<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>mytitle</title>
</head>
<body>
    /WEB-INF/jsp/show.jsp
    <h3>msg数据${msg}</h3>
    <h3>fun数据${fun}</h3>
    name = ${myname}<br>
    age = ${myage}<br>
    student数据：${myStudent}
</body>
</html>
