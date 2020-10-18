package com.zhang.dao.impl;

import com.zhang.dao.ClassDao;
import com.zhang.domain.Classes;
import com.zhang.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.util.List;

public class ClassDapImpl implements ClassDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Classes> findAll() {
        String sql = "select * from class";
        List<Classes> classes = template.query(sql, new BeanPropertyRowMapper<Classes>(Classes.class));
        return classes;
    }

    @Override
    public void addClasses(Classes classes) {
        String sql = "insert into class values(null,?,?)";
        template.update(sql, classes.getCname(), classes.getPrice());
    }

    @Override
    public void deleteClasses(String id) throws IOException {
        String sql = "delete from class where id = ?";
        template.update(sql, id);
    }

    @Override
    public void updateClasses(Classes classes) {
        String sql = "update class set cname = ?,price = ? where id = ?";
        template.update(sql, classes.getCname(), classes.getPrice(), classes.getId());
    }

    @Override
    public Classes findClassesById(int id) {
        String sql = "select * from class where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<Classes>(Classes.class), id);
    }

    @Override
    public List<Classes> findByName(String cname) {
        String sql = "select * from class where cname = ?";
        List<Classes> classes = template.query(sql, new BeanPropertyRowMapper<Classes>(Classes.class), cname);
        return classes;
    }


}
