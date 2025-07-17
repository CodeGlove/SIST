<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>페이지2</h1>
<%-- request에 v1이라는 이름으로 저장한 값 출력하자 --%>
<%--<% String v1 = (String)request.getAttribute("v1")%>--%>
<h2>${requestScope.v1}</h2>
</body>
</html>
