<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>mytitle</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
      $(function () {
        $('button').click(function () {
          $.ajax({
            url:"test/myajax.do",
            data:{
              name:"zs",
              age:"24"
            },
            type:"post",
            dataType:"json",
            success:function (resp) {
              alert("resp:"+resp.name+" " +resp.age);
            }
          })
        })
      })
    </script>
  </head>
  <body>
  index.jsp <br>
  <button>发起Ajax请求</button>
    <a href="test/other.do">跳转到other页面</a><br>
    <a href="test/some.do">跳转到some页面</a><br>
      <br>
    <form action="test/some.do" method="post">
      <input type="submit" value="跳转到some页面">
    </form>
      <br>
    <form action="test/other.do" method="post">
      <input type="submit" value="跳转到other页面">
    </form>

  <br>
  <form action="test/register.do" method="post">
      姓名:<input type="text" name="myname"/>
      年龄:<input type="text" name="age"/><br>
        <input type="submit" value="注册">
  </form>

    <form action="test/receiveObject.do" method="post">
      姓名:<input type="text" name="name"/>
      年龄:<input type="text" name="age"/><br>
      <input type="submit" value="注册">
    </form>

  </body>
</html>
