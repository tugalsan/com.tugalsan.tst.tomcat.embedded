package com.tugalsan.tst.tomcat.embedded.listeners;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebListener
public class TS_TomcatListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(TS_TomcatListener.class.getSimpleName()
                + ".contextInitialized"
        );
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(TS_TomcatListener.class.getSimpleName()
                + ".contextDestroyed"
        );
    }
}
