package com.zhang.service;

import com.zhang.domain.ViewClassMember;

import java.util.List;

public interface ViewClassMemberService {

    public List<ViewClassMember> findAll();

    void deleteViewClassMembers(String mname);

    void addViewClassMembers(ViewClassMember viewClassMember);
}
