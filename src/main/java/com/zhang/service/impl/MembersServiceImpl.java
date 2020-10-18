package com.zhang.service.impl;

import com.zhang.dao.MembersDao;
import com.zhang.dao.impl.MembersDaoImpl;
import com.zhang.domain.Members;
import com.zhang.service.MembersService;

import java.util.List;

public class MembersServiceImpl implements MembersService {

    private MembersDao membersDao = new MembersDaoImpl();

    public List<Members> findAll() {
        return membersDao.findAll();
    }

    @Override
    public void addMembers(Members members) {
        membersDao.addMembers(members);
    }

    @Override
    public void deleteMembers(String id) {
        membersDao.delete(Integer.parseInt(id));
    }

    @Override
    public Members findMembersById(String id) {
        return membersDao.findById(Integer.parseInt(id));
    }

    @Override
    public void updateMembers(Members members) {
        membersDao.update(members);
    }

    @Override
    public List<Members> findByName(String mname) {
        return membersDao.findByName(mname);
    }

}
