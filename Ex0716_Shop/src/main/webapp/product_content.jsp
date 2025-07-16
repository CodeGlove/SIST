<%@ page import="mybatis.vo.ProductVO" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<div id="wrap">
    <header>
        <jsp:include page="./menu.jsp"/>
    </header>

    <article>
        <jsp:useBean id="sb" class="shop.bean.ShopBean" scope="session"/>
        <jsp:setProperty name="sb" property="*"/>

        <%
            sb.getProduct();


            ProductVO vo = sb.getProduct();
        %>
        <table class="table">
            <tr>
                <th >세부정보</th>
                <td><%=vo.getP_content()%></td>
            </tr>
        </table>
    </article>
</div>
</body>
</html>
