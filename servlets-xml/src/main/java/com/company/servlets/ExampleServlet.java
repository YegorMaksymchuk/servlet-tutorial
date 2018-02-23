package com.company.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleServlet extends HttpServlet {

    private String message = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<h1><br/>" + message + "</h2");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Was destroyed!! =(");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("was created ! =)");
        message = "Yehaa !! \n I am the best servlet in the world !!\n ";
    }
}
