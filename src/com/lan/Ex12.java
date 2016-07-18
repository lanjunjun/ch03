package com.lan;

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
 * service()方法展示网页链接驱动与维护网站周期数据的功能
 */
@WebServlet(name = "Ex12",value = "/servlet/Ex12")
public class Ex12 extends HttpServlet {

    int i=0;

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * 使用service()保存网站周期数据，该类数据生存与打开网站与关闭网站之间
     */
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        i=i+1;   //设置网站周期数据的测试，每打开网页一次，i就加1，并存储起来。
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Ex12</title></head><body>");
        out.println("This is the Sub Page of Ex12<br/>");
        out.println("Driven by Ex12.html"+"<br/>");
        out.println("网站数据 i=" + i + "<br/>");

        out.println("</body></html>");
        out.close();
    }
}
