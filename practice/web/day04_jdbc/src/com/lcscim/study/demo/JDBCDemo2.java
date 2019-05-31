package com.lcscim.study.demo;

import com.lcscim.study.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        boolean login = new JDBCDemo2().login(username, password);
        if (login){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名或密码错误");
        }
    }

    public boolean login(String username,String password){
        if (username == null || password == null){
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet result = null;
        try {
            conn = JDBCUtils.connection();
            String str = "select * from user where name = ? and password = ?";
            pstmt = conn.prepareStatement(str);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            result = pstmt.executeQuery();
            return result.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(result,pstmt,conn);
        }

        return false;
    }
}
