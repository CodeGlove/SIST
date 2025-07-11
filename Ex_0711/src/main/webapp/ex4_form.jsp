
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<article>
  <header>
    <h2>폼 연습</h2>
  </header>
  <div>
    <form action="ex4.jsp" method="post" name="fff">
      <label for="s_int">숫자입력:</label>
      <input type="text" id="s_int" name="s_num"/><br/>
      <button type="button" onclick="exe()">보내기</button>
    </form>
  </div>
</article>

<script>
  function exe() {
    //유효성 검사 생략
    //document.forms[0].submit();
    document.fff.submit();//폼의 이름으로 접근하여 보내는 법

  }
</script>
</body>
</html>
