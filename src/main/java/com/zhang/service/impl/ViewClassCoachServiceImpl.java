package com.zhang.service.impl;

import com.zhang.dao.ViewClassCoachDao;
import com.zhang.dao.impl.ViewClassCoachDaoImpl;
import com.zhang.domain.ViewClassCoach;
import com.zhang.service.ViewClassCoachService;

import java.util.List;

public class ViewClassCoachServiceImpl implements ViewClassCoachService {

    private ViewClassCoachDao viewClassCoachDao = new ViewClassCoachDaoImpl();

    @Override
    public List<ViewClassCoach> findAll() {
        return viewClassCoachDao.findAll();
    }
}
