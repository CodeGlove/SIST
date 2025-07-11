<%@ page import="mybatis.dao.MemoDAO" %><%--
  Created by IntelliJ IDEA.
  User: 쌍용교육센터
  Date: 2025-07-11
  Time: 오후 5:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String writer = request.getParameter("writer");
String content = request.getParameter("content");
int cnt = MemoDAO.addMemo(writer, content);

        %>
<script>
  <%
  if(cnt > 0){
    %>
  alert
  ("저장완료!");
  <%
  }else{

  %>
  alert("저장실패");<%
  }
  %>

</script>
</body>
</html>
