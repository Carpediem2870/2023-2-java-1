package com.green.day24;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() {
        Connection conn = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver"); //org.mariadb.jdbc 패키지
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // (대문자)클래스이름.메서드명은 Static 메서드
        } catch (Exception e) {
            System.out.println("에러발생!!");
            e.printStackTrace();
        }
        System.out.println("접속 성공!!");
        return conn;
    }

}