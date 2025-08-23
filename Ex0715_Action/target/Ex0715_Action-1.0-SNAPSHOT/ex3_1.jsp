
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  //요청시 한글처리
  request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="pvo" class="test.vo.ParamVO" scope="session"/>
<%-- paramVO pvo = new ParamVO();와 같은 것이다. --%>

<jsp:setProperty name="pvo" property="*"/>  <%-- param은 property와 이름이 같으면 생략가능, *는 모든 property를 pvo에 채울거다. --%>


<h3><%=pvo.getS_name()%></h3>
<h3><%=pvo.getS_email()%></h3>
<h3><%=pvo.getS_age()%></h3>
<button type="button" onclick="javascript:location.href='ex3_2.jsp'">다음페이지</button> <!--onclick할때 함수를 호출하면되는데 함수가 한줄이기때문에 함수를 안만들고 저렇게도 쓸 수 있다. -->
</body>
</html>
