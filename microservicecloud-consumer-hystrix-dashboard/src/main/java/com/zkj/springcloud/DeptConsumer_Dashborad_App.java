package com.zkj.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-02 22:27
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_Dashborad_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashborad_App.class,args);

    }
}
