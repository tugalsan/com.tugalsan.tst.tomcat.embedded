package com.tugalsan.tst.tomcat.embedded;

import com.tugalsan.tst.tomcat.embedded.servlets.*;

public class Main {

    //HOW TO EXECUTE
    //C:\me\codes\com.tugalsan\tst\com.tugalsan.tst.tomcat.embedded>target\bin\webapp.bat
    public static void main(String[] args) {
        var tomcatBall = TS_TomcatBall.of("",
                servlets -> {
                    servlets.add(new TS_ServletAlive());
                }, connectors -> {
                    connectors.add(TS_TomcatConnector.ofUnSecure(8087));
//                    connectors.add(TS_TomcatConnector.ofUnSecure(8088));
                }
        );
        System.out.println("SAFE EXIT: " + tomcatBall);
    }
}
