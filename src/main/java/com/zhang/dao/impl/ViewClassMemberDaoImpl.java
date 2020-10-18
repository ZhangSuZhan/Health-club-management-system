package com.zhang.dao.impl;

import com.zhang.dao.ViewClassMemberDao;
import com.zhang.domain.ViewClassMember;
import com.zhang.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ViewClassMemberDaoImpl implements ViewClassMemberDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<ViewClassMember> findAll() {
        String sql = "select * from view_members_class_info";
        List<ViewClassMember> viewClassMembers = template.query(sql, new BeanPropertyRowMapper<ViewClassMember>(ViewClassMember.class));
        return viewClassMembers;
    }

    @Override
    public void deleteViewClassMembers(String mname) {
        String sql = "delete from view_members_class_info where mname= ?";
        template.update(sql, mname);
    }

    @Override
    public void addViewClassMembers(ViewClassMember viewClassMember) {
        String sql = "insert into view_members_class_info values(?,?)";
        template.update(sql, viewClassMember.getMname(), viewClassMember.getCname());
    }
}
