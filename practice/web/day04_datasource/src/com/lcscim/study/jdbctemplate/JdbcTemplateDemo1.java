package com.lcscim.study.jdbctemplate;

import com.lcscim.study.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "insert into bank values(null,?,?)";
        int update = template.update(sql,"王五",3000);
        System.out.println(update);
    }
}
