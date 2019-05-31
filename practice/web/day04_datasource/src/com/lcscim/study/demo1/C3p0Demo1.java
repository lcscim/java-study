package com.lcscim.study.demo1;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Demo1 {
    public static void main(String[] args) {
        DataSource ds = new ComboPooledDataSource();
        try {
            Connection conn = ds.getConnection();
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
