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
<% //선언문 사용하면 안된다.
    String id = request.getParameter("s_id");
    String pw = request.getParameter("s_pw");
%>
<h2>아이디:<%=id%></h2>
<h2>비밀번호:<%=pw%></h2>
</body>
</html>










