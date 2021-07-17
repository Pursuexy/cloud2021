package com.pursuexy.cloud2021.service;

import com.pursuexy.cloud2021.entities.CommonResult;
import com.pursuexy.cloud2021.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Pursuexy
 * @date 2021/7/16 16:36
 **/
@Component
@FeignClient("CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

}
