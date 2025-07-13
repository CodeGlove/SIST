package com.example.servelet_review;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/my")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //요청한 곳으로부터 인자로 넘어오는 값을 하나씩 받는다.
        response.setContentType("text/html;charset=UTF-8");
        String mId = request.getParameter("m_id");
        String mPw = request.getParameter("m_pw");

        System.out.println(mId+":"+mPw);
    }
}
