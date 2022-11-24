package com.tugalsan.tst.tomcat.embedded.servlets;

import com.tugalsan.tst.tomcat.embedded.TS_ServletAbstract;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class TS_ServletAlive extends TS_ServletAbstract {

    @Override
    public String name() {
        return TS_ServletAlive.class.getSimpleName();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(TS_ServletAlive.class.getName());
        resp.flushBuffer();
    }
}
