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
        <jsp:useBean id="sb" class="shop.bean.ShopBean" scope="session"/> <!-- id, class, scope 모두 같아야 재사용한다. 하나라도 다르면 새로 만든다. -->
        <jsp:setProperty name="sb" property="*"/>  <!-- parameter와 property가 다르면 property 뒤에 param="파라미터이름" 을 적어주면 된다. -->

        <%
            ProductVO vo = sb.getProduct();
        %>
        <table>
            <colgroup>
                <col width="40%">
                <col width="60%">
            </colgroup>
            <tbody>
            <tr>
                <td>제품Category</td>
                <td></td>
            </tr>
            <tr>
                <td>제품번호</td>
                <td></td>
            </tr>
            <tr>
                <td>제품이름</td>
                <td></td>
            </tr>
            <tr>
                <td>제품 판매사</td>
                <td></td>
            </tr>
            <tr>
                <td>제품가격</td>
                <td>(할인가 :<%=vo.getP_price()%>  )</td>
            </tr>
            <tr>
                <td colspan="2">제품설명</td>
            </tr>
            <tr>
                <td colspan="2" align="center"><img src ="images/" width="100" height="95"></td>
            </tr>
            <tr>
                <td colspan="2"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="button" value="장바구니에 담기"
                           onclick="javascript:location.href='addProduct.jsp?p_num='"/>
                    <input type="button" value="장바구니 보기"
                           onclick="javascript:location.href='cartList.jsp'"/>
                </td>
            </tr>
            </tbody>
        </table>
    </article>
</div>
</body>
</html>
