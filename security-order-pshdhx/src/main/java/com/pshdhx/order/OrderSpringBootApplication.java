package com.pshdhx.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSpringBootApplication.class, args);
    }
}
