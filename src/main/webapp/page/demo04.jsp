<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%! int day = 3; %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>demo04</title>
</head>
<body>
<h1>IF...ELSE-实例</h1>
<% if (day == 1 || day == 7) { %>
<p>今天是周末</p>
<% } else { %>
<p>今天不是周末</p>
<% } %>


<h1>SWITCH...CASE-实例</h1>
<%
    switch(day) {
        case 0:
            out.println("星期天");
            break;
        case 1:
            out.println("星期一");
            break;
        case 2:
            out.println("星期二");
            break;
        case 3:
            out.println("星期三");
            break;
        case 4:
            out.println("星期四");
            break;
        case 5:
            out.println("星期五");
            break;
        default:
            out.println("星期六");
    }
%>

<h1>For循环-测试实例</h1>
<%! int fontSize1; %>
<%for ( fontSize1 = 3; fontSize1 <= 7; fontSize1++){ %>
<font color="green" size="<%= fontSize1 %>">
    显示字体
</font><br />

<%}%>


<h1>While循环-测试实例</h1>
<%! int fontSize2=3; %>
<%while ( fontSize2 <= 7){ %>
<font color="green" size="<%= fontSize2 %>">
    显示字体
</font><br />
<%fontSize2++;%>
<%}%>
</body>
</html> 