package com.zhang.servlet.viewservlet;

import com.zhang.domain.ViewClassMember;
import com.zhang.service.ViewClassMemberService;
import com.zhang.service.impl.ViewClassMemberServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/viewClassMembersServlet")
public class ViewClassMembersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ViewClassMemberService viewClassMemberService=new ViewClassMemberServiceImpl();
        List<ViewClassMember> viewClassMembers = viewClassMemberService.findAll();
        request.setAttribute("viewClassMembers", viewClassMembers);
        request.getRequestDispatcher("/view_class_members.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
