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
 * 展示网页链接与表单输入的交互功能
 */
@WebServlet(name = "Ex06",value ="/servlet/Ex06" )
public class Ex06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        String val = request.getParameter("data");
        String textareadate = request.getParameter("textareadate");
        String inputdata = request.getParameter("course");

        String[] checkboxvals = request.getParameterValues("manyCourse");
        String selectCourse = request.getParameter("selectCourse");
        String selectCourse2 = request.getParameter("selectCourse2");
        String[] selectCourse3 = request.getParameterValues("selectCourse3");

        out.println("<html><head><title>Ex06</title></head><body>");
        out.println("This is the Sub Page of Ex06"+"<br/>");
        out.println(""+"<br/>");
        out.println("Data："+val+"<br/>");
        out.println("textAreaDate："+textareadate+"<br/>");
        out.println("最喜欢的课程："+inputdata+"<br/>");
        out.println("许多喜欢的课程"+"<br/>");
        for (int i=0;i<checkboxvals.length;i++){
            out.println(checkboxvals[i]+"<br/>");
        }
        out.println("下拉列表喜欢的课程"+selectCourse+"<br/>");
        out.println("下拉列表喜欢的课程"+selectCourse2+"<br/>");
        for (int i=0;i<selectCourse3.length;i++){
            out.println(selectCourse3[i]+"<br/>");
        }
        out.println("</body></html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
