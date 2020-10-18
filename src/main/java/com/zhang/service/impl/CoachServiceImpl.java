package com.zhang.service.impl;

import com.zhang.dao.CoachDao;
import com.zhang.dao.impl.CoachDaoImpl;
import com.zhang.domain.Coach;
import com.zhang.service.CoachService;

import java.util.List;

public class CoachServiceImpl implements CoachService {
    private CoachDao coachDao = new CoachDaoImpl();

    public List<Coach> findAll() {
        return coachDao.findAll();
    }

    @Override
    public void addCoach(Coach coach) {
        coachDao.addCoach(coach);
    }

    @Override
    public void deleteCoach(String id) {
        coachDao.delete(Integer.parseInt(id));
    }

    @Override
    public Coach findCoachById(String id) {
        return coachDao.findById(Integer.parseInt(id));
    }

    @Override
    public List<Coach> findByName(String name) {
        return coachDao.findByName(name);
    }

    @Override
    public void updateCoach(Coach coach) {
        coachDao.update(coach);
    }
}
