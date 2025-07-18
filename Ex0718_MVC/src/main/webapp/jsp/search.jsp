<%@ page import="mybatis.vo.EmpVO" %><%--
  Created by IntelliJ IDEA.
  User: 쌍용교육센터
  Date: 2025-07-18
  Time: 오후 4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  Object obj = request.getAttribute("ar");
  if(obj != null){
    EmpVO[] ar = (EmpVO[]) obj;
    for (EmpVO vo : ar){
%>
<tr>
  <td><%=vo.getEmpno()%></td>
  <td><%=vo.getEname()%></td>
  <td><%=vo.getJob()%></td>
  <td><%=vo.getSal()%></td>
  <td><%=vo.getHiredate()%></td>
  <td><%=vo.getDeptno()%></td>
</tr>
<%
    }//for의 끝
  }
%>