package com.lan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Administrator on 2016/7/16.
 * 捕捉客户端的所有信息
 */
@WebServlet(name = "Ex04",value = "/servlet/Ex04")
public class Ex04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String item = null,value = null;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>Ex04</title></head><body>");
        out.println("<table border=\"1\">");
        Enumeration<String> en =request.getHeaderNames();
        while (en.hasMoreElements()){
            item = (String)en.nextElement();
            value = request.getHeader(item);
            out.println("<tr><td>"+item+"</td><td>"+value+"</td></tr>");
        }
        out.println("</table>");
        out.println("</body></html>");
        out.close();
    }
}
