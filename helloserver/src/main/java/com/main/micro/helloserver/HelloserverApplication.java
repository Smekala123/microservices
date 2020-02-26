package com.main.micro.helloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloserverApplication.class, args);
    }

}
