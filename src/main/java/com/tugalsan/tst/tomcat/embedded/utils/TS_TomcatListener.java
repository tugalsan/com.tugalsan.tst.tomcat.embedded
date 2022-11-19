package com.tugalsan.tst.tomcat.embedded.utils;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebListener
public class TS_TomcatListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("TS_TomcatListener.contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("TS_TomcatListener.contextDestroyed");
    }
}
