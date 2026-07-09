package com.vehicle.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.vehicle.dao.UserDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            UserDAO dao = new UserDAO();

            if (dao.login(email, password)) {
                HttpSession session = req.getSession();
                session.setAttribute("userId", dao.getUserId(email));
                session.setAttribute("userName", email);

                res.sendRedirect(req.getContextPath() + "/views/dashboard.jsp");
            } else {
                res.getWriter().println("Invalid Login");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}	