package com.zkj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-10 18:40
 **/
@SpringBootApplication
@EnableEurekaServer        //Eureka服务器端启动类，接受其他微服务注册进来
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
