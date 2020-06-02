package com.lc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JdEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdEurekaApplication.class, args);
        System.out.println("eureka启动");
    }

}
