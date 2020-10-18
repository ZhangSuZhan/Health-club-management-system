package com.zhang.servlet.viewservlet;

import com.zhang.domain.ViewClassCoach;
import com.zhang.service.ViewClassCoachService;
import com.zhang.service.impl.ViewClassCoachServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/viewClassCoachServlet")
public class ViewClassCoachServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ViewClassCoachService viewClassCoachService = new ViewClassCoachServiceImpl();
        List<ViewClassCoach> viewClassCoach = viewClassCoachService.findAll();
        request.setAttribute("viewClassCoach", viewClassCoach);
        request.getRequestDispatcher("/view_class_coach.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
