package com.zhang.dao.impl;

import com.zhang.dao.MembersDao;
import com.zhang.domain.Members;
import com.zhang.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MembersDaoImpl implements MembersDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Members> findAll() {
        String sql = "select * from members";
        List<Members> members = template.query(sql, new BeanPropertyRowMapper<Members>(Members.class));
        return members;
    }

    @Override
    public void addMembers(Members members) {
        String sql = "insert into members values(null,?,?,?,?,?)";
        template.update(sql, members.getMname(), members.getSex(), members.getAge(), members.getPhoneNumber(), members.getMoney());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from members where id = ?";
        template.update(sql, id);
    }

    @Override
    public Members findById(int id) {
        String sql = "select * from members where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<Members>(Members.class), id);
    }

    @Override
    public void update(Members members) {
        String sql = "update members set mname = ?,sex = ? ,age = ? , phoneNumber = ? , money = ? where id = ?";
        template.update(sql, members.getMname(), members.getSex(), members.getAge(), members.getPhoneNumber(), members.getMoney(), members.getId());
    }

    @Override
    public List<Members> findByName(String mname) {
        String sql = "select * from members where mname = ?";
        List<Members> members = template.query(sql, new BeanPropertyRowMapper<Members>(Members.class), mname);
        return members;
    }

}
