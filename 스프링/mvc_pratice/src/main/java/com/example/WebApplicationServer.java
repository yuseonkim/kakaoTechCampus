package com.example;

import org.apache.catalina.startup.Tomcat;
import org.slf4j.LoggerFactory;

import java.io.File;

import org.slf4j.Logger;

public class WebApplicationServer{
        private static final Logger log = LoggerFactory.getLogger(WebApplicationServer.class);

        public static void main(String[] args) throws Exception{
            String webappDirLocation = "webapps/";
            Tomcat tomcat = new Tomcat();
            tomcat.setPort(8080);
            tomcat.getConnector();

            tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
            log.info("configuring app wit basedir : {}", new File("./"+webappDirLocation).getAbsolutePath());

            tomcat.start();
            tomcat.getServer().await();
    }
}
