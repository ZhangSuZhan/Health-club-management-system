package com.zhang.dao;

import com.zhang.domain.Members;

import java.util.List;

public interface MembersDao {

    public List<Members> findAll();

    void addMembers(Members members);


    void delete(int id);

    Members findById(int id);

    void update(Members members);

    List<Members> findByName(String mname);

}
