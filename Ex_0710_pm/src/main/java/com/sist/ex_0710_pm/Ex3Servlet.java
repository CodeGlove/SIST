package com.sist.ex_0710_pm;

import mybatis.dao.EmpDAO;
import mybatis.vo.EmpVO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ex3")
public class Ex3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        //파라미터들 받기
        String type = request.getParameter("searchType");
        String value = request.getParameter("searchValue");

        EmpVO[] list = EmpDAO.search(type, value);

        StringBuffer sb = new StringBuffer("<ol>");
        for(EmpVO vo : list){
            sb.append("<li>");
            sb.append(vo.getEmpno()); //사번
            sb.append(",");
            sb.append(vo.getEname()); //이름
            sb.append(",");
            sb.append(vo.getJob()); //직종
            sb.append(",");
            sb.append(vo.getDeptno()); //부서코드
            sb.append("</li>");
        }//for의 끝
        sb.append("</ol>");

        //응답을 위한 스트림 생성
        PrintWriter out = response.getWriter();
        out.println("<h2>검색 결과</h2>");
        out.println("<hr/>");
        out.println(sb.toString());
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
