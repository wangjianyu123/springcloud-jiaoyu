package com.lc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class JdConfig4Application {

    public static void main(String[] args) {

        SpringApplication.run(JdConfig4Application.class, args);
        System.out.println("启动");
    }

}
