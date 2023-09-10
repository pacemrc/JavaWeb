<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>demo02</title>
</head>
<body>
<h1>Jsp隐式对象-测试实例</h1>
<% out.println("获取内置对象request.getHeader(\"Host\")的结果" + request.getHeader("Host")); %><br>
<% out.print("这是内置对象out.print的输出信息"); %>
</body>
</html>