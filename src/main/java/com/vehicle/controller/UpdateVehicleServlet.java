package com.vehicle.controller;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.sql.*;
import com.vehicle.util.DBConnection;

@WebServlet("/updateVehicle")
public class UpdateVehicleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String status = req.getParameter("status");

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "UPDATE vehicles SET status=? WHERE id=?")) {

            ps.setString(1, status);
            ps.setInt(2, id);

            ps.executeUpdate();

            res.sendRedirect("views/dashboard.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}