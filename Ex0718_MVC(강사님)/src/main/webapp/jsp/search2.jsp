<%@ page import="mybatis.vo.EmpVO" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="org.json.JSONArray" %>
<%@ page contentType="application/json;charset=UTF-8" language="java" %>
<%
  Object obj = request.getAttribute("ar");
  if(obj != null){
    EmpVO[] ar = (EmpVO[]) obj;
    JSONObject jsonList = new JSONObject();
    JSONArray itemList = new JSONArray();
    int i=0;
    for(EmpVO vo : ar){
      //자바스크립트에서 인식할 수 있도록 JSON표기법을 구현하자!
      JSONObject json = new JSONObject(); // {} json객체 생성
      json.put("empno", vo.getEmpno()); // { empno:'1000' }
      json.put("ename", vo.getEname()); // { empno:'1000', ename: '이도' }
      json.put("job", vo.getJob());
      json.put("sal", vo.getSal());
      json.put("hiredate", vo.getHiredate());
      json.put("deptno", vo.getDeptno());

      itemList.put(json);// [ {empno:'1000', ename:'이도', ....}, ]
    }//for의 끝
    jsonList.put("items", itemList);// { items:[{empno:'1000', ename:'이도', ....},] }
    out.println(jsonList);//응답내용
  }
%>



















