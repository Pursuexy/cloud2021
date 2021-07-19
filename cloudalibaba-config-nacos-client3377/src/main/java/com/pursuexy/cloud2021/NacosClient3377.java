package com.pursuexy.cloud2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosClient3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosClient3377.class, args);
    }
}
