<%--
  Created by IntelliJ IDEA.
  User: 쌍용교육센터
  Date: 2025-07-11
  Time: 오전 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<%
  String num = request.getParameter("s_num");


    int dan = Integer.parseInt(num);

%>

<h2>입력값:<%=dan%></h2>
<%
  StringBuffer sb = new StringBuffer();
  for(int i=1; i<10; i++){
    sb.append(dan);
    sb.append("*");
    sb.append(i);
    sb.append("=");
    sb.append(dan*i);
    sb.append("<br/>");
  }
  sb.toString();
  out.println(sb);
%>
</body>
</html>


