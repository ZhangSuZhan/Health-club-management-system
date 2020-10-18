package com.zhang.dao;

import com.zhang.domain.Coach;

import java.util.List;


public interface CoachDao {


    List<Coach> findAll();

    void addCoach(Coach coach);

    void delete(int parseInt);

    Coach findById(int parseInt);

    void update(Coach coach);

    List<Coach> findByName(String name);
}
