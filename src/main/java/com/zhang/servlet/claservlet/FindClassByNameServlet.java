package com.zhang.servlet.claservlet;

import com.zhang.domain.Classes;
import com.zhang.service.ClassService;
import com.zhang.service.impl.ClassServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findClassByName")
public class FindClassByNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String cname = request.getParameter("cname");
        System.out.println(cname);
        ClassService classService = new ClassServiceImpl();
        List<Classes> classes = classService.findByName(cname);
        System.out.println(classes.toString());
        request.setAttribute("classes", classes);
        request.getRequestDispatcher("/classlist.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
