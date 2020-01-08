package com.iwiscloud.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZullApplication {

    public static void main(String[] args) {
		System.out.println("xdclass");
        SpringApplication.run(ZullApplication.class, args);
    }

}
