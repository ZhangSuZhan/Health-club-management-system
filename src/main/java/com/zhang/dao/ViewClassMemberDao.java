package com.zhang.dao;

import com.zhang.domain.ViewClassMember;

import java.util.List;

public interface ViewClassMemberDao {
    public List<ViewClassMember> findAll();

    void deleteViewClassMembers(String mname);

    void addViewClassMembers(ViewClassMember viewClassMember);
}
