/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import business.Bug;
import data.BugDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author amar_
 */
public class addBug extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //call the viewBug method 
        Bug bug = BugDB.viewBug();
        //change bu id to string

        //save the object to the request object
        //set the URL
//        String url = "/addTickets.jsp";
        //use the request dispatcher
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String requestURI = request.getRequestURI();
        String url = "/index.html";
        if (requestURI.endsWith("/addBug")) {
            url = addTickets(request, response);
            Bug bug = BugDB.viewBug();
            System.out.println(bug.getId());
            System.out.println(bug.getDescription());
            request.setAttribute("bug", bug);
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    private String addTickets(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String bugName = request.getParameter("name");
        String bugDescription = request.getParameter("description");
        Bug addBug = new Bug(bugName, bugDescription);
        addBug.setName(bugName);
        addBug.setDescription(bugDescription);
        session.setAttribute("bug", addBug);
        BugDB.insertBug(addBug);
        return "/addTickets.jsp";
    }
}
