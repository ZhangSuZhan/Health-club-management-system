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

@WebServlet("/findClassesServlet")
public class FindClassServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        ClassService classService = new ClassServiceImpl();
        Classes classes = classService.findClassesById(id);
        request.setAttribute("classes", classes);
        request.getRequestDispatcher("/classupdate.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
