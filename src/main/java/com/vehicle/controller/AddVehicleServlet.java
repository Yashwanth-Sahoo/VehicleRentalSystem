package com.vehicle.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.vehicle.dao.VehicleDAO;
import com.vehicle.model.Vehicle;

@WebServlet("/addVehicle")
public class AddVehicleServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        Vehicle v = new Vehicle();

        v.setName(req.getParameter("name"));
        v.setType(req.getParameter("type"));
        v.setPrice(Double.parseDouble(req.getParameter("price")));
        v.setStatus("Available");

        try {
            new VehicleDAO().addVehicle(v);
            res.sendRedirect(req.getContextPath() + "/DashboardServlet");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}