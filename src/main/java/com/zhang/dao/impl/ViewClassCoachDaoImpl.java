package com.zhang.dao.impl;

import com.zhang.dao.ViewClassCoachDao;
import com.zhang.domain.ViewClassCoach;
import com.zhang.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ViewClassCoachDaoImpl implements ViewClassCoachDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<ViewClassCoach> findAll() {
        String sql = "select * from view_class_coach_info";
        List<ViewClassCoach> viewClassCoach = template.query(sql, new BeanPropertyRowMapper<ViewClassCoach>(ViewClassCoach.class));
        return viewClassCoach;
    }
}
