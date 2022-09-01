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
        <h3>/WEB-INF/view/hello.jsp从request作用域获取数据</h3><br/>
        <h3>myname数据：${param.myname}</h3><br/>
        <h3>myage数据：${param.myage}</h3>
        <h3>取参数数据：<%=request.getParameter("myname")%></h3>
</body>
</html>
