package com.tugalsan.tst.tomcat.embedded;

import com.tugalsan.tst.tomcat.embedded.servlets.ServletByMapping;
import com.tugalsan.tst.tomcat.embedded.utils.TS_TomcatConnector;

public class Main {

    //HOW TO EXECUTE
    //C:\me\codes\com.tugalsan\tst\com.tugalsan.tst.tomcat.embedded>target\bin\webapp.bat
    public static void main(String[] args) {
        var tomcatBall = TS_Tomcat.of(
                Main.class,
                "",
                servlets -> {
                    servlets.add(new ServletByMapping());
                }, connectors -> {
                    connectors.add(TS_TomcatConnector.ofUnSecure(8085));
                    connectors.add(TS_TomcatConnector.ofUnSecure(8086));
                }
        );
        System.out.println(tomcatBall);
    }
}
