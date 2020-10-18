package com.zhang.dao.impl;

import com.zhang.dao.CoachDao;
import com.zhang.domain.Coach;
import com.zhang.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CoachDaoImpl implements CoachDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Coach> findAll() {
        String sql = "select * from coach";
        List<Coach> coach = template.query(sql, new BeanPropertyRowMapper<Coach>(Coach.class));
        return coach;
    }

    @Override
    public void addCoach(Coach coach) {
        String sql = "insert into coach values(null,?,?,?,?,?)";
        template.update(sql, coach.getName(), coach.getSex(), coach.getAge(), coach.getPhoneNumber(), coach.getSalary());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from coach where id = ?";
        template.update(sql, id);
    }

    @Override
    public Coach findById(int id) {
        String sql = "select * from coach where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<Coach>(Coach.class), id);
    }

    @Override
    public void update(Coach coach) {
        String sql = "update coach set name = ?,sex = ? ,age = ? , phoneNumber = ? , salary = ? where id = ?";
        template.update(sql, coach.getName(), coach.getSex(), coach.getAge(), coach.getPhoneNumber(), coach.getSalary(), coach.getId());
    }

    @Override
    public List<Coach> findByName(String name) {
        String sql = "select * from coach where name = ?";
        List<Coach> coach = template.query(sql, new BeanPropertyRowMapper<Coach>(Coach.class), name);
        return coach;
    }
}
