package com.zhang.servlet.coachservlet;

import com.zhang.domain.Coach;
import com.zhang.service.CoachService;
import com.zhang.service.impl.CoachServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/coachListServlet")
public class CoachServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CoachService coachService = new CoachServiceImpl();
        List<Coach> coach = coachService.findAll();
        request.setAttribute("coach", coach);
        request.getRequestDispatcher("/coachlist.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
