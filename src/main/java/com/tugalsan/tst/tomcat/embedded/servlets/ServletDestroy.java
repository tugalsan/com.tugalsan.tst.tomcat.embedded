package com.tugalsan.tst.tomcat.embedded.servlets;

import com.tugalsan.api.unsafe.client.TGS_UnSafe;
import com.tugalsan.tst.tomcat.embedded.TS_Tomcat;
import com.tugalsan.tst.tomcat.embedded.utils.TS_TomcatBall;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet(
        name = "ServletDestroy",//JUST A UNQUE TAG
        urlPatterns = {"/ServletDestroy"}
)
public class ServletDestroy extends HttpServlet {

    public static TS_TomcatBall tomcatBall;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TGS_UnSafe.execute(() -> {
            if (tomcatBall != null) {
                tomcatBall.destroy();
            }
            System.exit(0);
        });
    }
}
