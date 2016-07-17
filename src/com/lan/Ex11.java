package com.lan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/7/17.
 * 删除目录
 */
@WebServlet(name = "Ex11",value = "/servlet/Ex11")
public class Ex11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");

        String val = request.getParameter("dir");
        File f = new File(val);

        out.println("<html><head><title>Ex11</title></head><body>");
        out.println("This is the Sub Page of Ex11<br/>");
        out.println("</br>");

        if(f.delete()){
            out.println("成功删除目录：" + val + "</br>");
        }else {
            out.println("删除目录失败：" + "</br>");
        }

        out.println("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
