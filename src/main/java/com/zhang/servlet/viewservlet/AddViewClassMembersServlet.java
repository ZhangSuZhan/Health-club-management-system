package com.zhang.servlet.viewservlet;

import com.zhang.domain.ViewClassMember;
import com.zhang.service.ViewClassMemberService;
import com.zhang.service.impl.ViewClassMemberServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/addViewCLassMembersServlet")
public class AddViewClassMembersServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Map<String, String[]> map = request.getParameterMap();
        ViewClassMember viewClassMember = new ViewClassMember();
        try {
            BeanUtils.populate(viewClassMember, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        ViewClassMemberService viewClassMemberService = new ViewClassMemberServiceImpl();
        viewClassMemberService.addViewClassMembers(viewClassMember);
        response.sendRedirect(request.getContextPath() + "/viewClassMembersServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
