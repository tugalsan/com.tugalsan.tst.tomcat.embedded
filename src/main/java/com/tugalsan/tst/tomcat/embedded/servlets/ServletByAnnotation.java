package com.tugalsan.tst.tomcat.embedded.servlets;

import com.tugalsan.api.thread.server.TS_ThreadWait;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import com.tugalsan.api.unsafe.client.*;
import com.tugalsan.tst.tomcat.embedded.utils.*;
import java.time.Duration;

@WebServlet(
        name = "ServletDestroy",//JUST A UNQUE TAG
        urlPatterns = {"/ServletDestroy"}
)
public class ServletByAnnotation extends HttpServlet {

    public static TS_TomcatBall tomcatBall;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TGS_UnSafe.execute(() -> {
             if (tomcatBall != null) {
                tomcatBall.destroy();
            }
            TS_ThreadWait.of(Duration.ofSeconds(5));
            System.exit(0);
        });
    }
}
