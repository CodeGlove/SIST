<%@ page import="mybatis.vo.MemoVO" %>
<%@ page import="mybatis.dao.MemoDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>

  <style>
    #list_table{
      border-collapse: collapse;
      width: 400px;
    }
    #list_table th, #list_table td{
      border: 1px solid #27a;
      padding: 3px;
    }
    #list_table thead th{
      background: #5ad;
      color: #fff;
    }
    #list_table caption{
      font-size: 30px;
      font-weight: bold;
      padding-bottom: 20px;
    }

    .btn{
      width: 70px;
      height: 20px;
      text-align: center;
      padding:0px;
    }

    .btn a{
      display: block;
      width: 100%;
      padding: 4px;
      height: 20px;
      line-height: 20px;
      background: #27a;
      color: #fff;
      border-radius: 3px;
      text-decoration: none;
      font-size: 12px;
      font-weight: bold;
    }
    .btn a:hover{
      background: #fff;
      color: #27a;
      border: 1px solid #27a;
    }

    #list_table thead tr:first-child td{
      border: none;
    }

    #write_win{ display: none; }

    #writer{
      background-color: #dedede;
      border: 1px solid #ababab;
    }
  </style>
</head>
<body>

<div id="wrap">
  <table id="list_table">
    <caption>메모 리스트</caption>
    <colgroup>
      <col width="50px">
      <col width="*">
      <col width="80px">
      <col width="90px">
    </colgroup>
    <thead>
    <tr>
      <td colspan="4" >
        <p class="btn">
          <a href="javascript:writeMemo()">
            글쓰기
          </a>
        </p>
      </td>
    </tr>
    <tr>
      <th>번호</th>
      <th>내용</th>
      <th>글쓴이</th>
      <th>등록일</th>
    </tr>
    </thead>
    <tbody>

    <ul>
      <%
        for(MemoVO vo :list){
      %>
      <li><%=vo.getWriter()%>, <%=vo.getContent()%></li>
      <%
        }//for의 끝
      %>
    </ul>
    </tbody>
  </table>
</div>


<div id="write_win" title="글쓰기">
  <form action="add.jsp" method="post">
    <table>
      <tbody>

      <tr>
        <td><label for="writer">작성자:</label></td>
        <td>
          <input type="text" id="writer"
                 name="writer"
                 value=""
                 />
        </td>
      </tr>
      <tr>
        <td><label for="content">내용:</label></td>
        <td>
							<textarea cols="40" rows="6"
                                      id="content" name="content"></textarea>
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <p class="btn">
            <a href="javascript:exe(this.form)">
              저장
            </a>
          </p>
        </td>
      </tr>
      </tbody>
    </table>
  </form>
</div>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<script>
  function writeMemo() {
    //숨겨진 div를 보이도록 해야한다.
    $("#write_win").css("display", "block");
  }

  function exe() {
        let writer = document.getElementById("writer")
        let content = document.getElementById("content")
    if(writer.value.trim().length == 0) {
      alert("이름을 입력하세요.");
      no.value = "";
      no.focus();
      return;
    }
    if(content.value.trim().length == 0) {
      alert("내용을 입력하세요.");
      no.value = "";
      no.focus();
      return;
    }
    document.forms[0].submit();
  }

</script>
</body>
</html>










