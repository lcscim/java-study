package com.itcast.dao;

import com.itcast.domain.User;
import com.itcast.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    public User login(User loginUser){
        String sql = "select * from user where username = ? and password = ?";
        User user = template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), loginUser.getUsername(), loginUser.getPassword());
        return user;
    }
}
