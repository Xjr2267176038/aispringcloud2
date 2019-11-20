package com.soudthwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//包含了@EnableServer,设置了该类是网关的启动类。
@EnableZuulProxy
//可以帮助SpringBoot应用将所有符合条件的@Configuration配置加载到当前springboot创建并使用的IOC容器中
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
