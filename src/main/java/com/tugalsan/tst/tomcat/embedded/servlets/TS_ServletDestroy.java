package com.tugalsan.tst.tomcat.embedded.servlets;

import com.tugalsan.tst.tomcat.embedded.TS_TomcatBall;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

//ServletByAnnotation
@WebServlet(
        name = "TS_ServletDestroy",//JUST A UNQUE TAG
        urlPatterns = {"/TS_ServletDestroy"}
)
public class TS_ServletDestroy extends HttpServlet {

    public static TS_TomcatBall tomcatBall;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var waitSeconds = 5;
        if (tomcatBall != null) {
            tomcatBall.destroy(waitSeconds,waitSeconds);
        }
        System.exit(0);
    }
}
