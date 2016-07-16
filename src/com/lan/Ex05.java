package com.lan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/7/16.
 * 简单的页面跳转链接，从Ex5.html跳到此servlet
 */
@WebServlet(name = "Ex05",value = "/servlet/Ex05")
public class Ex05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Ex05</title></head><body>");
        out.println("This is the Sub Page of Ex05"+"<br/>");
        out.println("Driven by Ex05.html"+"<br/>");
        out.println("</body></html>");
        out.close();
    }
}
