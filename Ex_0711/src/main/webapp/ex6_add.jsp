<%@ page import="mybatis.dao.EmpDAO" %><%--
  Created by IntelliJ IDEA.
  User: 쌍용교육센터
  Date: 2025-07-11
  Time: 오후 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  //요청시 한글처리
  request.setCharacterEncoding("utf-8");

  //파라미터 값들 받기
  String empno =request.getParameter("empno");
  String ename =request.getParameter("ename");
  String job =request.getParameter("job");
  String hiredate =request.getParameter("hdate");
  String ip =request.getRemoteAddr();//ip
  int cnt = EmpDAO.addEmp(empno, ename, job, hiredate);

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
