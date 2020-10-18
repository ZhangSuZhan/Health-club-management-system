package com.zhang.service;

import com.zhang.domain.Coach;

import java.util.List;

public interface CoachService {

    List<Coach> findAll();

    void updateCoach(Coach coach);

    void deleteCoach(String id);

    void addCoach(Coach coach);

    Coach findCoachById(String id);

    List<Coach> findByName(String name);
}
