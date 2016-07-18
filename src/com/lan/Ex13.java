package com.lan;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/7/17.
 * init()是用于网页周期的方法，主要功能为：维护网页周期数据，每当客户端打开网页时，将其代码块范围内的数据进行初始值的加载
 * destroy()是用于网页周期的方法，主要功能为：每当客户端关闭网页时，将网页周期数据删除。destroy()为程序默认方法，无论是否编写
 * 在关闭网页时，系统都将执行此方法
 */
@WebServlet(name = "Ex13",value = "/servlet/Ex13")
public class Ex13 extends HttpServlet {

    int i=0,j=0;

    @Override
    public void init(ServletConfig config) throws ServletException {
        j=j+1;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        i=i+1;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Ex13</title></head><body>");
        out.println("This is the Sub Page of Ex13<br/>");
        out.println("Driven by Ex13.html"+"<br/>");
        out.println("网站数据 i=" + i + "<br/>");
        out.println("网站数据 j=" + j + "<br/>");

        out.println("</body></html>");
        out.close();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
