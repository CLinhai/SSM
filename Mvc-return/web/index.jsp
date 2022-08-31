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
            url:"test/returnStringData.do",
            data:{
              name:"zs",
              age:"24"
            },
            type:"post",
            dataType:"json",
            success:function (resp) {
              // alert("resp:"+resp.name+" " +resp.age);
              // alert(data.name+" " +data.age);
            /*  $.each(data,function (i,n) {
                alert(n.name+"==="+n.age)
              })*/
              alert("返回文本数据"+resp);
            }
          })
        })
      })
    </script>
  </head>
  <body>
    index.jsp <br>
    <button>发起Ajax请求</button>
  </body>
</html>
