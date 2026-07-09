package com.vehicle.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.sql.*;
import com.vehicle.util.DBConnection;

@WebServlet("/SearchVehicleServlet")
public class SearchVehicleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "SELECT * FROM vehicles WHERE name LIKE ?")) {

            ps.setString(1, "%" + name + "%");

            ResultSet rs = ps.executeQuery();
            req.setAttribute("result", rs);

            req.getRequestDispatcher("views/searchVehicle.jsp").forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}