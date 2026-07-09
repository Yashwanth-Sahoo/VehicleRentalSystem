package com.vehicle.controller;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.sql.*;
import com.vehicle.util.DBConnection;

@WebServlet("/deleteVehicle")
public class DeleteVehicleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "DELETE FROM vehicles WHERE id=?")) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                // ✅ redirect back to list
                response.sendRedirect(request.getContextPath() + "/viewVehicles");
            } else {
                response.getWriter().println("Delete failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}