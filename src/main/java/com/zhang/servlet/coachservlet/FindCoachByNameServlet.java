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

@WebServlet("/findCoachByName")
public class FindCoachByNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        System.out.println(name);
        CoachService coachService = new CoachServiceImpl();
        List<Coach> coach = coachService.findByName(name);
        System.out.println(coach.toString());
        request.setAttribute("coach", coach);
        request.getRequestDispatcher("/coachlist.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
