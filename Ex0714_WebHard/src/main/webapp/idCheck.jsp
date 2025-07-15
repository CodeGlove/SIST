<%@ page import="mybatis.dao.MemberDAO" %>
<%@ page import="mybatis.dao.MemoDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id = request.getParameter("u_id");
    boolean res = MemberDAO.idCheck(id);
    int chk = 0;
    if(res)
        chk = 1;
/*
    if(MemberDAO.idCheck(id))
        response.sendRedirect("reg.jsp?m_id="+id+"&chk=1");//이전에 넘어온 파라미터를 다시 전달하면 리퀘스트, 리스폰스가 새로 전달되기때문에
                                                            //값을 넣어줘야한다. 번거롭기때문에 비동기식 통신이 나왔다.
    else

        response.sendRedirect("reg.jsp?m_id="+id+"&chk=0");

 */
%>
<jsp:forward page="reg.jsp">
    <jsp:param name="chk" value="<%=chk%>"/>
</jsp:forward>
