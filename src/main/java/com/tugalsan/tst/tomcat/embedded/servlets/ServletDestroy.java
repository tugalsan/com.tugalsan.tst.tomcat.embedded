package com.tugalsan.tst.tomcat.embedded.servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import com.tugalsan.api.unsafe.client.*;
import com.tugalsan.tst.tomcat.embedded.utils.*;

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
//            System.exit(0);
        });
    }
}
