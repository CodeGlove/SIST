package com.example.servelet_review;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyServlet3")
public class Myservlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 요청시 한글처리
        request.setCharacterEncoding("utf-8");

        //파라미터들 받기 - 파라미터 이름이 같은 것들은 배열로 받아야 한다.
        String[] names = request.getParameterValues("m_name");

        //응답을 위한 한글처리!
        response.setContentType("text/html; charset=UTF-8");
        //응답을 스트림 생성
        PrintWriter out = response.getWriter();
        // 응답 시작
        out.println("<h2>받은 값:</h2>");
        out.println("<ul>");
        for(int i=0; i<names.length; i++){
            out.println("<li>");
            out.println(names[i]);
            out.println("</li>");
        }//for의 끝
        out.println("</ul>");
        out.close();
    }
}
