package com.example.servelet_review; // 현재 패키지 이름이 자동으로 들어갑니다.

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/ms1") // 클래스 이름을 소문자로 변환하여 URL 경로로 사용
public class MyServlet1 extends HttpServlet { // 사용자가 입력한 파일 이름이 클래스 이름으로 들어갑니다.

    public MyServlet1() {
        System.out.println("생성자!");
    }

    @Override
    public void destroy() {
        System.out.println("destroy!");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init!");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service!");
        //요청한 방식이 get이면 doGet을 호출한다.
        if(req.getMethod().equalsIgnoreCase("get"))
            doGet(req, resp);
        else
            doPost(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost");
    }
}