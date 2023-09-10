<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>demo03</title>
</head>
<body>
<h3>Jsp注释</h3>
<h3>Jsp脚本程序</h3>
<h3>Jsp表达式</h3>
<h3>JSP声明</h3>
<h3>JSP指令</h3>
<h3>JSP行为</h3>
<h3>Jsp流程控制语句：<a href="demo04.jsp">demo</a></h3>
<h3>JSP字面量</h3>
<p>
<%--这是Jsp的注释--%>

    今天的日期是: <%= (new java.util.Date()).toLocaleString()%>

</p>
</body>
</html>