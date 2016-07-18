package com.lan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/7/17.
 * 以写入Cookie展示数据共享的功能
 * 存取cookie案例
 */
@WebServlet(name = "Ex15",value = "/servlet/Ex15")
public class Ex15 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");

        String val = request.getParameter("data");
        Cookie cok = new Cookie("msg",val);
        cok.setMaxAge(3600 * 24 * 3);
        response.addCookie(cok);

        out.println("<html><head><title>Ex15</title></head><body>");
        out.println("This is the Sub Page of Ex15<br/>");
        out.println("<br/>");
        out.println("成功写入Cookie:" + val + "<br/>");

        //以下是取cookie的例子
   /*     String cokData = null;
        Cookie[] coks = request.getCookies();
        for (int i=0;i<coks.length;i++){
            if(coks[i].getName().equals("msg")){
                cokData = coks[i].getValue();
                out.println(cokData);
            }else {
                out.println("无Cookie共享数据");
            }
        }*/

        out.println("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
