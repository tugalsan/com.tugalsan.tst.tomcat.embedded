package com.tugalsan.tst.tomcat.embedded.utils;

import com.tugalsan.api.stream.client.TGS_StreamUtils;
import com.tugalsan.api.unsafe.client.TGS_UnSafe;
import com.tugalsan.tst.tomcat.embedded.servlets.ServletAbstract;
import java.nio.file.Path;
import java.util.List;
import org.apache.catalina.*;
import org.apache.catalina.startup.*;

public record TS_TomcatBall(
        Path project,
        Path project_src_main_webapp,
        Path project_target_classes,
        Tomcat tomcat,
        Context context,
        CharSequence contextName_as_empty_or_slashName,
        WebResourceRoot resources,
        List<ServletAbstract> servlets,
        List<TS_TomcatConnector> connectors) {

    public void destroy() {
        connectors().forEach(connector -> {
            TGS_UnSafe.execute(() -> {
                connector.destroy();
            }, e -> TGS_StreamUtils.doNothing());
        });
//        TGS_UnSafe.execute(() -> {
//            context().destroy();
//        }, e -> TGS_StreamUtils.doNothing());
    }

}
