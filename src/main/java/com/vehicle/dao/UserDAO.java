package com.vehicle.dao;

import java.sql.*;
import com.vehicle.util.DBConnection;

public class UserDAO {

    public boolean login(String email, String password) throws Exception {

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "SELECT * FROM users WHERE email=? AND password=?")) {

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            return rs.next();
        }
    }

    public int getUserId(String email) throws Exception {

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "SELECT id FROM users WHERE email=?")) {

            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) return rs.getInt("id");
        }
        return 0;
    }

    public void signup(String name, String email, String password) throws Exception {

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "INSERT INTO users(fullname,email,password) VALUES(?,?,?)")) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);

            ps.executeUpdate();
        }
    }
}