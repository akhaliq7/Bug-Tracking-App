/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import business.User;
import data.UserDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author amar_
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        //Call UserDB authenticate method 
        UserDB userLogin = new UserDB();
        String url = "";
        try {
            User user = userLogin.authenticate(username, password);
            
            System.out.println(user.getUsername());
            if (user.getUsername() != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                url = "/index.html";
            } else {
                String message = "Invalid email or password";
                request.setAttribute("message", message);
                url = "/index.html";
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
            getServletContext().getRequestDispatcher(url)
                    .forward(request, response);
    }

}


