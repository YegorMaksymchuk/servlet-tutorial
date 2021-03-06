package com.company.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormWriterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        String title = "Passing parameters using GET method";

        String docType = "<!DOCTYPE html>";

        writer.println("<html>" +
                "<head><title>" + title + "</title></head>\n" +
                "<body><h2>Username: </h2>" + request.getParameter("username") +
                "<h2>Password: </h2>" + request.getParameter("password")
                + "</body>" +
                "</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
