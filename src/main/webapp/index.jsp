<%@ page contentType="text/html;charset=utf-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>JavaWEB</title>
</head>
<body>
<h1>JavaWEB</h1>

<h1>Listener-Filter-Servlet</h1>
<h2>注解</h2>
<p>${pageContext.request.contextPath}/test/annotation/filter</p>
<a href="${pageContext.request.contextPath}/test/annotation/filter">测试注解filter</a>
<p>${pageContext.request.contextPath}/test/annotation/servlet</p>
<a href="${pageContext.request.contextPath}/test/annotation/servlet">测试注解servlet</a>
<p>${pageContext.request.contextPath}/test/annotation/listener</p>
<a href="${pageContext.request.contextPath}/test/annotation/listener">测试注解listener</a>
<h2>配置文件</h2>
<p>${pageContext.request.contextPath}/test/xml/filter</p>
<a href="${pageContext.request.contextPath}/test/xml/filter">测试配置文件filter</a>
<p>${pageContext.request.contextPath}/test/xml/servlet</p>
<a href="${pageContext.request.contextPath}/test/xml/servlet">测试配置文件servlet</a>
<p>${pageContext.request.contextPath}/test/xml/listener</p>
<a href="${pageContext.request.contextPath}/test/xml/listener">测试配置文件listener</a>

<h1>JSP</h1>
<h3>Jsp生命周期-测试实例：<a href="page/demo01.jsp">demo01</a></h3>
<h3>Jsp隐式对象-测试实例：<a href="page/demo02.jsp">demo02</a></h3>
<h3>Jsp语法-测试实例：<a href="page/demo03.jsp">demo03</a></h3>
<h3>Jsp客户端请求-测试实例：<a href="page/demo05.jsp">demo05</a></h3>
<h3>Jsp自动刷新-测试实例：<a href="page/demo06.jsp">demo06</a></h3>
<h3>Jsp表单处理-测试实例：<a href="page/demo07.jsp">demo07</a></h3>
<h3>Jsp文件上传-测试实例：<a href="page/demo08.jsp">demo08</a></h3>
<h1>Others</h1>
<h3>TomcatServlet回显：<a href="TomcatEchoServlet">测试加上参数：?cmd=whoami</a> </h3>
</body>
</html>