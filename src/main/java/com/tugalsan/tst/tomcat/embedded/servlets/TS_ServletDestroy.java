package com.tugalsan.tst.tomcat.embedded.servlets;

import com.tugalsan.api.log.server.TS_Log;
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

    final private static TS_Log d = TS_Log.of(TS_ServletDestroy.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(TS_ServletDestroy.class.getName());
        resp.flushBuffer();
        var waitSeconds = 5;
        if (TS_TomcatBall.self == null) {
            d.ce("doGet", "tomcatBall == null");
        } else {
            TS_TomcatBall.self.destroy(waitSeconds, waitSeconds);
        }
//        System.exit(0);
    }
}
