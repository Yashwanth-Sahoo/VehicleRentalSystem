package com.vehicle.dao;

import java.sql.*;
import java.util.*;

import com.vehicle.model.Vehicle;
import com.vehicle.util.DBConnection;

public class VehicleDAO {

    // ➕ Add Vehicle
    public void addVehicle(Vehicle v) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO vehicles(name,type,price_per_day,status) VALUES(?,?,?,?)"
        );

        ps.setString(1, v.getName());
        ps.setString(2, v.getType());
        ps.setDouble(3, v.getPrice());
        ps.setString(4, v.getStatus());

        ps.executeUpdate();

        con.close(); // ✅ important
    }

    // 📋 Get All Vehicles
    public List<Vehicle> getAllVehicles() throws Exception {

        List<Vehicle> list = new ArrayList<>();

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM vehicles");

        while (rs.next()) {
            Vehicle v = new Vehicle();

            v.setId(rs.getInt("id"));
            v.setName(rs.getString("name"));
            v.setType(rs.getString("type"));
            v.setPrice(rs.getDouble("price_per_day"));
            v.setStatus(rs.getString("status"));

            list.add(v);
        }

        con.close(); // ✅ important

        return list;
    }
}