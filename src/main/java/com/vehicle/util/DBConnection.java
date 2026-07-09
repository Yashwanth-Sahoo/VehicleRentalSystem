package com.vehicle.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/vehiclerental?useSSL=false&serverTimezone=UTC",
            "username",
            "password"
        );
    }
}
