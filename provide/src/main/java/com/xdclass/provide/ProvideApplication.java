package com.xdclass.provide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xdclass.provide.mapper")
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class, args);

    }

}
