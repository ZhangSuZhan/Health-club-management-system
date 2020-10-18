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
import java.util.List;

@WebServlet("/findMembersByName")
public class FindMembersByNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String mname = request.getParameter("mname");
        System.out.println(mname);
        MembersService membersService = new MembersServiceImpl();
        List<Members> members = membersService.findByName(mname);
        System.out.println(members.toString());
        request.setAttribute("members", members);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
