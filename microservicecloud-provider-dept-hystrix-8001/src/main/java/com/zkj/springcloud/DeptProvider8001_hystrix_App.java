package com.zkj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-05-10 10:50
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //对hystrix熔断器的支持
public class DeptProvider8001_hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_hystrix_App.class,args);
    }
}
