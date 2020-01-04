package com.iwiscloud.dashboadrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DashboadrdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboadrdApplication.class, args);
    }

}
