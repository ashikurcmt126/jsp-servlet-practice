package com.servlets;


import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FirstServlets implements Servlet {

    //Life cycle methods

    ServletConfig servletConfig;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("Creating object.. ");
    }


    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing...");

        //set the content type of the response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my output from servlet method: </h1>");
        out.println("<h1>Todays date and time is: "+new Date().toString());
    }

    public void destroy() {
        System.out.println("Going to destroy servlet object...");
    }


    // Non life-cycle method

    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    public String getServletInfo() {
        return "This servlet is created by Ashikur Rahman Rashid";
    }

}
