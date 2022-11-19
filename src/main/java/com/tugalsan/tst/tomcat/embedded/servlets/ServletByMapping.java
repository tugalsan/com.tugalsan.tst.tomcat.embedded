package com.tugalsan.tst.tomcat.embedded.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class ServletByMapping extends ServletAbstract {

    @Override
    public String name() {
        return ServletByMapping.class.getSimpleName();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(ServletByMapping.class.getName());
    }
}
