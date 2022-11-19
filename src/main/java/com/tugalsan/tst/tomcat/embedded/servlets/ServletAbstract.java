package com.tugalsan.tst.tomcat.embedded.servlets;

import jakarta.servlet.http.HttpServlet;

public abstract class ServletAbstract extends HttpServlet{
    abstract public String name();
}
