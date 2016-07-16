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
 */
@WebServlet(name = "Ex02",value = "/servlet/Ex02")
public class Ex02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int x=2,y=3,z;
        z=x*y;
        response.setContentType("text/html;charset=UTF-8");
        //response.setContentType("text/html;charset=GB2312");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Ex02</title></head><body>");
        out.println("x乘以y的结果为："+z);
        out.println("</body></html>");
        out.close();


    }
}
