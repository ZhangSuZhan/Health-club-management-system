package com.zhang.servlet.viewservlet;

import com.zhang.service.ViewClassMemberService;
import com.zhang.service.impl.ViewClassMemberServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelViewClassMembersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mname = request.getParameter("mname");
        ViewClassMemberService viewClassMemberService = new ViewClassMemberServiceImpl();
        viewClassMemberService.deleteViewClassMembers(mname);
        response.sendRedirect(request.getContextPath() + "/viewClassMembersServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
