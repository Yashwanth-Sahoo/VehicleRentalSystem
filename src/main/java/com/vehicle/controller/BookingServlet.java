package com.vehicle.controller;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.vehicle.util.DBConnection;

@WebServlet("/bookVehicle")
public class BookingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        // ✅ Check login
        if (session == null || session.getAttribute("userId") == null) {
            res.sendRedirect(req.getContextPath() + "/views/login.jsp");
            return;
        }

        int userId = (Integer) session.getAttribute("userId");
        int vehicleId = Integer.parseInt(req.getParameter("vehicleId"));

        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");

        try (Connection con = DBConnection.getConnection()) {

            // 🔥 Step 1: Get vehicle price
            PreparedStatement ps1 = con.prepareStatement(
                "SELECT price_per_day FROM vehicles WHERE id=?"
            );
            ps1.setInt(1, vehicleId);
            ResultSet rs = ps1.executeQuery();

            double pricePerDay = 0;

            if (rs.next()) {
                pricePerDay = rs.getDouble("price_per_day");
            } else {
                res.getWriter().println("Invalid Vehicle ID");
                return;
            }

            // 🔥 Step 2: Calculate total days
            long diff = Date.valueOf(endDate).getTime() - Date.valueOf(startDate).getTime();
            long days = diff / (1000 * 60 * 60 * 24);

            if (days <= 0) {
                res.getWriter().println("Invalid dates");
                return;
            }

            double total = days * pricePerDay;

            // 🔥 Step 3: Insert booking
            PreparedStatement ps2 = con.prepareStatement(
                "INSERT INTO bookings(user_id,vehicle_id,start_date,end_date,total_price,status) VALUES(?,?,?,?,?,?)"
            );

            ps2.setInt(1, userId);
            ps2.setInt(2, vehicleId);
            ps2.setString(3, startDate);
            ps2.setString(4, endDate);
            ps2.setDouble(5, total);
            ps2.setString(6, "Booked");

            ps2.executeUpdate();

            // 🔥 Step 4: Update vehicle status
            PreparedStatement ps3 = con.prepareStatement(
                "UPDATE vehicles SET status='Booked' WHERE id=?"
            );
            ps3.setInt(1, vehicleId);
            ps3.executeUpdate();

            // ✅ Redirect
            res.sendRedirect(req.getContextPath() + "/views/dashboard.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}