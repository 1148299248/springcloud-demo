package com.iwiscloud.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZullApplication {

    public static void main(String[] args) {
		System.out.println("12223");
        SpringApplication.run(ZullApplication.class, args);
    }

}
