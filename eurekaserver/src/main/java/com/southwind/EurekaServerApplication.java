package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//声明该类是一个Spring Boot的服务入口
@SpringBootApplication
//声明该类是一个Eureka Server 微服务，提供服务注册和服务发现功能，及注册中心
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
