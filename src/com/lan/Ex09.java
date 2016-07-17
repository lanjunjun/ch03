package com.lan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/7/17.
 * 展示网页链接与读取文件的交互功能
 */
@WebServlet(name = "Ex09",value="/servlet/Ex09")
public class Ex09 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");

        String val_fil = request.getParameter("fil");
        BufferedReader fin = new BufferedReader(new FileReader(val_fil));  //创建文件读取对象fin
        int msg;

        out.println("<html><head><title>Ex09</title></head><body>");
        out.println("This is the Sub Page of Ex09<br/>");
        out.println("</br>");

        while ((msg = fin.read())!=-1){    //以方法fin.read()读取文件内容。其中-1为文件结束符号
            out.println((char)msg);        //将文件内容类型转换成字符型打印在子网页上
        }
        fin.close();
        out.println("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
