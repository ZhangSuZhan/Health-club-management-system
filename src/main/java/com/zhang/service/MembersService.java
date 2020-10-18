package com.zhang.service;

import com.zhang.domain.Members;

import java.util.List;

public interface MembersService {
    public List<Members> findAll();

    void addMembers(Members members);

    void deleteMembers(String id);

    Members findMembersById(String id);

    void updateMembers(Members members);

    List<Members> findByName(String mname);
}
