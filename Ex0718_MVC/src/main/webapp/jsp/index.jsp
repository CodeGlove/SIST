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
        <table>
            <caption>검색 테이블</caption>
            <tbody>
            <tr>
                <td>
                    <select id="searchType" name="searchType">
                        <option value="0">사번</option>
                        <option value="1">이름</option>
                        <option value="2">직종</option>
                        <option value="3">급여</option>
                        <option value="4">입사일</option>
                        <option value="5">부서</option>
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
                    <button type="button" id="search_btn3" class="btn">검색(json)</button>
                </td>
            </tr>
            </tfoot>
        </table>
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

        $("#search_dig").dialog(option);

        $("#search_btn").click(function () {
            $("#search_dig").dialog("open");
        });

        $("#search_btn2").click(function () {
            let searchType = $("#searchType").val();
            let searchValue = $("#searchValue").val().trim();
            if(searchValue.trim().length == 0){
                alert("값을 입력하세요");
                $("#searchValue").val("");
                $("#searchValue").focus();
                return;
            }

            $.ajax({
                url:"Controller",
                type:"post",
                data:{type: "search",
                    searchType: searchType,
                    searchValue: searchValue
                }

            }).done(function (res) {

                $("table.table>tbody").html(res);
                $("#search_dig").dialog("close");
            });
        });

        $("#search_btn3").click(function () {
            let searchType = $("#searchType").val();
            let searchValue = $("#searchValue").val().trim();
            if(searchValue.trim().length == 0){
                alert("값을 입력하세요");
                $("#searchValue").val("");
                $("#searchValue").focus();
                return;
            }

            $.ajax({
                url:"Controller",
                type:"post",
                dataType:"json", //서버에서 응답하는 데이터 형식
                data:{type: "search2",
                    searchType: searchType,
                    searchValue: searchValue
                }

            }).done(function (res) {
                console.log(res.items.length);
                let str = "";
                for (let i=0; i<res.items.length; i++) {
                    str += "<tr><td>"
                    str += res.items[i].empno;
                    str += "</td><td>";
                    str += res.items[i].ename;
                    str += "</td><td>";
                    str += res.items[i].job;
                    str += "</td><td>";
                    str += res.items[i].sal;
                    str += "</td><td>";
                    str += res.items[i].hiredate;
                    str += "</td><td>";
                    str += res.items[i].deptno;
                }
                    $("table.table>tbody").html(str);
                    $("#search_dig").dialog("close");
            });
        });

    });
</script>
</body>
</html>
