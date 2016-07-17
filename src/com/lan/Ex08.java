package com.lan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/7/17.
 * 展示网页链接与写入文件的交互功能
 */
@WebServlet(name = "Ex08",value = "/servlet/Ex08")
public class Ex08 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        String val_fil = request.getParameter("fil");   //创建字符串读取主网页输入表单的文件Path与Name
        String val_filedata = request.getParameter("filedata");  //创建字符串读取主网页输入文本框的数据
        BufferedWriter fout = new BufferedWriter(new FileWriter(val_fil));  //创建文件写入对象fout

        out.println("<html><head><title>Ex08</title></head><body>");
        out.println("This is the Sub Page of Ex08<br/>");
        out.println("</br>");

        fout.write(val_filedata);   //以方法fout.write()将文本框的数据写入文件
        fout.newLine();
        fout.close();

        out.println("已成功将数据写入文件");
        out.println("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
