<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.13.0/themes/base/jquery-ui.css">
    <style>
        .table{
            width: 600px;
            border-collapse: collapse;
        }
        .table th, .table td{
            border: 1px solid #000;
            padding: 5px;
        }
        .table caption{
            text-indent: -9999px;
            height: 0px;
        }
        .txt_R{text-align: right;}
        .noBorder{border: none !important;}
    </style>
</head>
<body>

<div id="search_dig">
    <form action="/Ex3" method="post" name="frm">
        <table>
            <caption>검색 테이블</caption>
            <tbody>
            <tr>
                <td>
                    <select id="searchType" name="searchType">
                        <option value="0">사번</option>
                        <option value="1">이름</option>
                        <option value="2">직종코드</option>
                        <option value="3">부서</option>
                    </select>
                </td>
                <td>
                    <input type="text" id="searchValue" name="searchValue"/>

                </td>
            </tr>
            </tbody>
            <tfoot>
            <tr>
                <td colspan="2">
                    <button type="button" id="search_btn2" class="btn">검색</button>
                </td>
            </tr>
            </tfoot>
        </table>
    </form>
</div>
<div id="wrap">
  <header>
    <h1>사원 목록</h1>
  </header>
    <article>
        <table class="table">
            <caption>사원테이블</caption>
            <thead>
            <tr>
                <td colspan="6" class="txt_R noBorder" >
<%--                    <button type="button" id="total_btn" onclick="javascript:location.href='Controller?type=total'">전체보기</button>--%>
                    <button type="button" id="all_btn">전체(비동기식)</button>
                    <button type="button" id="total_btn" onclick="total()">전체</button>
                    <button type="button" id="search_btn">검색</button>
                    <button type="button" id="add_btn" onclick="javascript:location.href='Controller?type=add'">추가</button>
                    <button type="button" id="dept_btn" onclick="dept()">부서목록</button>
                </td>
            </tr>
            <tr>
                <th>사번</th>
                <th>이름</th>
                <th>직종</th>
                <th>급여</th>
                <th>입사일</th>
                <th>부서</th>
            </tr>
            </thead>
            <tbody></tbody>
        </table>
    </article>
</div>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.14.1/jquery-ui.js"></script>

<script>
    function total() {
        location.href='Controller?type=total';
    }

    function dept() {
        location.href= 'Controller?type=dept';
    }



    $(function() {
        $("#all_btn").click(function () {
        $.ajax({
            url:"Controller",
            type:"post",
            data:{type:"all"}

        }).done(function (res) {//res는 AllAction이 수행된 후 응답되는 all.jsp에서 반복수행된 tr들
            console.log(res);
            $("table.table>tbody").html(res)
        });
        });
    });

    $(function () {

        let option = {
            modal: true,
            autoOpen: false,
            title: '사번검색',
            resizable: false
        };
        $("#empno_dig").dialog(option);
        $("#search_dig").dialog(option);

        $("#empno_btn").click(function () {
            $("#empno_dig").dialog("open");
        });
        $("#send_btn").click(function () {
            let num = $("#empno_tx").val();

            if(num.trim().length == 0){
                alert("검색할 사번을 입력하세요");
                // document.getElementById("empno_tx").value ="";
                $("#empno_tx").val("");
                $("#empno_tx").focus();
                return;
            }

            //대화창의 검색버튼을 클릭했을 때 form을 서버로 보내야 한다.
            document.ff.submit();
        });

        $("#search_btn2").click(function () {
            let num = $("#searchValue").val();

            if(num.trim().length == 0){
                alert("검색할 사번을 입력하세요");
                // document.getElementById("empno_tx").value ="";
                $("#searchValue").val("");
                $("#searchValue").focus();
                return;
            }

            //대화창의 검색버튼을 클릭했을 때 form을 서버로 보내야 한다.
            document.frm.submit();
        });

        $("#search_btn").click(function () {
            $("#search_dig").dialog("open");

            $.ajax({
                url:"Controller",
                type:"post",
                data:{type:"search"}

            }).done(function (res) {//res는 AllAction이 수행된 후 응답되는 all.jsp에서 반복수행된 tr들

                $("table.table>tbody").html(res)
            });
        });
    });
</script>
</body>
</html>
