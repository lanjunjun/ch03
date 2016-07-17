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
 * Ex07.html与servlet网站程序Ex07.java,展示网页链接与创建目录的交互功能
 * 展示网页链接与创建文件的交互功能
 */
@WebServlet(name = "Ex07",value = "/servlet/Ex07")
public class Ex07 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");

        String val = request.getParameter("dir");
        File f = new File(val);
        out.println("<html><head><title>Ex07</title></head><body>");
        out.println("This is the Sub Page of Ex07<br/>");
        out.println("<br/>");
        /*if(f.mkdir()){
            out.println("成功创建目录："+val+"<br/>");
        }else {
            out.println("创建目录失败<br/>");
        }*/
        if(f.createNewFile()){
            out.println("成功创建新文件："+ val +"<br/>");
        }else {
            out.println("创建新文件失败：" + val +"<br/>");
        }
        out.println("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
