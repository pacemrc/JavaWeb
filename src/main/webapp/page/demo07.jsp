<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>demo07</title>
</head>
<body>
<h1>Form表单提交-测试实例</h1>
<h3>通过Servlet处理表单数据</h3>
<form action="/JavaWeb/myServlet" method="post">
      <input type="text" name="username">
      <input type="submit" value="提交">
  </form>
<br>
<h3>通过Jsp处理表单数据</h3>
  <form action="/JavaWeb/demo07.jsp" method="post">
      <input type="text" name="username">
      <input type="submit" value="提交">
  </form>
<%

    String username = request.getParameter("username");
    if(username != null){
        out.println(username);
    }

%>
</body>
</html>
