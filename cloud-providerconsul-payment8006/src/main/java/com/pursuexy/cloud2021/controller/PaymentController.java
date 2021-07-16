package com.pursuexy.cloud2021.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 * @author Pursuexy
 * @date 2021/7/16 13:08
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentZk() {
        return " springcloud with zookeeper:" + serverPort + UUID.randomUUID().toString();
    }
}
