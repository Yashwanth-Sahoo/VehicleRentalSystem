package com.vehicle.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.vehicle.dao.VehicleDAO;

@WebServlet("/viewVehicles")
public class ViewVehiclesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            req.setAttribute("vehicles", new VehicleDAO().getAllVehicles());
            req.getRequestDispatcher("views/viewVehicles.jsp").forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}