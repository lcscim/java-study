package com.lcscim.study.demo;

import com.lcscim.study.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            conn = JDBCUtils.connection();
            conn.setAutoCommit(false);
            String sql1 = "update bank set money = money - ? where id = ?";
            String sql2 = "update bank set money = money + ? where id = ?";
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);

            pstmt1.setInt(1, 500);
            pstmt1.setInt(2, 1);
            pstmt2.setInt(1, 500);
            pstmt2.setInt(2, 2);

            pstmt1.executeUpdate();
            pstmt2.executeUpdate();

            conn.commit();

        } catch (Exception e) {
            try {
                if (conn != null) {

                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if (pstmt2!=null){
                try {
                    pstmt2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt1!=null){
                try {
                    pstmt1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
