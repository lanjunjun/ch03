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
 * 本范例介绍如何捕捉客户端信息，包括：网络地址（IP）、操作系统(Operating System)、支持语言（Language）、浏览器信息(Browser Info)等
 */
@WebServlet(name = "Ex03",value = "/servlet/Ex03")
public class Ex03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String clientAddr = request.getRemoteAddr();   //获得客户端网络地址
        String clientOpt = request.getHeader("user-agent");  //获得客户端操作系统版本
        String clientLanguage = request.getHeader("accept-language");  //获取客户端支持的语言
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>Ex03</title></head><body>");
        out.println("clientAddress：" + clientAddr+ "<br/>");
        out.println("clientOpt：" + clientOpt+ "<br/>");
        out.println("clientLanguage：" + clientLanguage+ "<br/>");
        out.println("</body></html>");
        out.close();

    }
}
