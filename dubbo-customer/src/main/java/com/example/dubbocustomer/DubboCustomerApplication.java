package com.example.dubbocustomer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfig
@DubboComponentScan("com.example.dubbocustomer.service")
@SpringBootApplication
public class DubboCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerApplication.class, args);
    }

}
