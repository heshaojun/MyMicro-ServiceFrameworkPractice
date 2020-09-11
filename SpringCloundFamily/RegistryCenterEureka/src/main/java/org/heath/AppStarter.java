package org.heath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author heshaojun
 * @date 2020/9/11
 * @description TODO
 */
@SpringBootApplication
@EnableEurekaServer
public class AppStarter {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AppStarter.class);
        application.addListeners(new ApplicationPidFileWriter("app.pid"));
        application.run(args);
    }
}
