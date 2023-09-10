package com.tugalsan.tst.tomcat.embedded;

import com.tugalsan.api.tomcat.embedded.server.TS_TomcatBall;
import com.tugalsan.api.tomcat.embedded.server.servlets.*;
import com.tugalsan.api.tomcat.embedded.server.utils.*;

public class Main {

    //HOW TO EXECUTE
    //C:\me\codes\com.tugalsan\tst\com.tugalsan.tst.tomcat.embedded>target\bin\webapp.bat
    public static void main(String[] args) {
        var tomcatBall = TS_TomcatBall.of("",
                servlets -> {
                    servlets.add(new TS_ServletAliveByMapping());
                }, connectors -> {
                    connectors.add(TS_TomcatConnector.ofUnSecure(8087));
                }
        );
        System.out.println("SAFE EXIT: " + tomcatBall);
    }
//
//    public static void main(String... args)
//            throws Exception {
//        File baseFolder = new File(System.getProperty("user.dir"));
//        File appsFolder = new File(baseFolder, "web-apps");
//
//        var tomcat = new Tomcat();
//        tomcat.setBaseDir(baseFolder.getAbsolutePath());
//        tomcat.setPort(8080);
//        tomcat.getHost().setAppBase(appsFolder.getAbsolutePath());
//
//        // Call the connector to create the default connector.
//        tomcat.getConnector();
//
//        tomcat.addWebapp("", appsFolder.getAbsolutePath());
//        var wrapper = tomcat.addServlet("", "hello", new HelloServlet());
//        wrapper.setLoadOnStartup(1);
//        wrapper.addMapping("/*");
//
//        tomcat.start();
//        tomcat.getServer().await();
//    }
//
//    private static class HelloServlet extends HttpServlet {
//
//        @Override
//        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//                throws IOException {
//            resp.setStatus(200);
//
//            var writer = resp.getWriter();
//            writer.write("Hello from Tomcat native image!");
//            writer.flush();
//            writer.close();
//        }
//    }
}
