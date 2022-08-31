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
    <p>SSM开发--实现student表的操作</p>
  <table cellpadding="0" cellspacing="0">
      <tr>
        <td><a href="addStudent.jsp">注册学生</a> </td>
      </tr>
      <tr>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td><a href="listStudent.jsp">查询学生</a> </td>
      </tr>
  </table>
  </body>
</html>
