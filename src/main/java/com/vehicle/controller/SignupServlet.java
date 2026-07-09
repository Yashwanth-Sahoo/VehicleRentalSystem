package com.vehicle.controller;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.vehicle.dao.UserDAO;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        try {
            new UserDAO().signup(
                req.getParameter("fullname"),
                req.getParameter("email"),
                req.getParameter("password")
            );

            res.sendRedirect(req.getContextPath() + "/views/login.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}