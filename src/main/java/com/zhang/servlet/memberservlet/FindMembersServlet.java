package com.zhang.servlet.memberservlet;

import com.zhang.domain.Members;
import com.zhang.service.MembersService;
import com.zhang.service.impl.MembersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findMembersServlet")
public class FindMembersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        MembersService service = new MembersServiceImpl();
        Members members = service.findMembersById(id);
        request.setAttribute("members", members);
        request.getRequestDispatcher("/update.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
