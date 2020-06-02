package com.lc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.lc.mapper")
public class JdProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdProviderApplication.class, args);
        System.out.println("成功");
    }

}
