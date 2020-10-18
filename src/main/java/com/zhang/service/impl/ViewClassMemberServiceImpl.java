package com.zhang.service.impl;

import com.zhang.dao.ViewClassMemberDao;
import com.zhang.dao.impl.ViewClassMemberDaoImpl;
import com.zhang.domain.ViewClassMember;
import com.zhang.service.ViewClassMemberService;

import java.util.List;

public class ViewClassMemberServiceImpl implements ViewClassMemberService {
    private ViewClassMemberDao viewClassMemberDao = new ViewClassMemberDaoImpl();

    public List<ViewClassMember> findAll() {
        return viewClassMemberDao.findAll();
    }

    @Override
    public void deleteViewClassMembers(String mname) {
        viewClassMemberDao.deleteViewClassMembers(mname);
    }

    @Override
    public void addViewClassMembers(ViewClassMember viewClassMember) {
        viewClassMemberDao.addViewClassMembers(viewClassMember);
    }
}
