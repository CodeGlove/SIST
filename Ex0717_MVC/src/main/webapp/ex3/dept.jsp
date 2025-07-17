<%@ page import="mybatis.vo.EmpVO" %>
<%@ page import="mybatis.vo.DeptVO" %><%--
  Created by IntelliJ IDEA.
  User: 쌍용교육센터
  Date: 2025-07-17
  Time: 오후 3:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <style>
    #table{
      width: 600px;
      border-collapse: collapse;
    }
    #table th, #table td{
      border: 1px solid #000;
      padding: 5px;
    }
    #table caption{text-indent: -9999px;}
  </style>
</head>
<body>
<div id="wrap">
  <header>
    <h2>사원목록</h2>
  </header>
  <article>
    <table id="table">
      <caption>사원목록 테이블</caption>
      <thead>
      <tr>
        <th>부서코드</th>
        <th>부서명</th>
        <th>지역코드</th>
      </tr>
      </thead>
      <tbody>
      <%
        //request에 emp라는 이름을 저장된 객체를 가져온다.
        Object obj = request.getAttribute("dept");
        DeptVO[] ar = null;
        if(obj != null){
          ar = (DeptVO[]) obj;
          for(DeptVO vo : ar){

      %>
      <tr>
        <td><%=vo.getDeptno()%></td>
        <td><%=vo.getDname()%></td>
        <td><%=vo.getLoc_code()%></td>
      </tr>
      <%
          }//for의 끝
        }
      %>
      </tbody>
    </table>
  </article>
</div>
</body>
</html>
