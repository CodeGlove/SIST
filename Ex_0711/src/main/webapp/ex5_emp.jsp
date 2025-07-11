<%@ page import="java.util.List" %>
<%@ page import="mybatis.vo.EmpVO" %>
<%@ page import="mybatis.dao.EmpDAO" %><%--
  Created by IntelliJ IDEA.
  User: 쌍용교육센터
  Date: 2025-07-11
  Time: 오후 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>전체 사원</h1>
<hr/>
  <ul>
    <%
      //DAO를 통해 원하는 자원을 받는다.
      List<EmpVO> list = EmpDAO.getAll();
    %>
    <ul>
      <%
        for(EmpVO vo : list){
          %>
        <li><%=vo.getEmpno()%>, <%=vo.getEname()%></li>
      <%
        }//for의 끝
      %>
    </ul>
  </ul>
</body>
</html>
