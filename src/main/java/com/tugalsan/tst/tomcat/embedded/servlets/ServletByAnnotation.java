package com.tugalsan.tst.tomcat.embedded.servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet(
        name = "ServletHello",//JUST A UNQUE TAG
        urlPatterns = {"/anno"}
)
public class ServletByAnnotation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(ServletByAnnotation.class.getName());
    }
}
