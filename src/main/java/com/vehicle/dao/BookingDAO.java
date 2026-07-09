package com.vehicle.dao;

import java.sql.*;
import com.vehicle.util.DBConnection;

public class BookingDAO {

    public void book(int userId, int vehicleId, String start, String end, double total) throws Exception {

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "INSERT INTO bookings(user_id,vehicle_id,start_date,end_date,total_price,status) VALUES(?,?,?,?,?,?)")) {

            ps.setInt(1, userId);
            ps.setInt(2, vehicleId);
            ps.setString(3, start);
            ps.setString(4, end);
            ps.setDouble(5, total);
            ps.setString(6, "Booked");

            ps.executeUpdate();
        }
    }
}