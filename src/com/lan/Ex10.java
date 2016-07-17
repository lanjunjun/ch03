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
 * 展示网页链接与删除文件的交互功能
 */
@WebServlet(name = "Ex10",value = "/servlet/Ex10")
public class Ex10 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");

        String val = request.getParameter("fil");
        File f = new File(val);    //创建文件处理对象

        out.println("<html><head><title>Ex10</title></head><body>");
        out.println("This is the Sub Page of Ex10<br/>");
        out.println("</br>");

        if(f.delete()){         //以方法delete()删除文件，并打印出运行信息
            out.println("成功删除文件："+val + "<br/>");
        }else {
            out.println("删除文件失败" + "<br/>");
        }
        out.println("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
