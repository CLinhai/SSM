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
        <h3>/WEB-INF/view/show.jsp从request作用域获取数据</h3><br/>
        <h3>myname数据：${myname}</h3><br/>
        <h3>myage数据：${myage}</h3>
</body>
</html>
