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
 * synchronized是方法的修饰符，可令该方法有“同步/锁住"的功能。允许多个线程同步进入就绪状态，但同一时刻仅允许其中一个进入临界区运行
 */
@WebServlet(name = "Ex14",value = "/servlet/Ex14")
public class Ex14 extends HttpServlet {

    int i=0,j=0;

    @Override
    public void init(ServletConfig config) throws ServletException {
        j=j+1;
    }

    @Override
    public synchronized void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        i=i+1;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Ex14</title></head><body>");
        out.println("This is the Sub Page of Ex14<br/>");
        out.println("Driven by Ex14.html"+"<br/>");
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
