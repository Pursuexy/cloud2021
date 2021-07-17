package com.pursuexy.cloud2021.service;

import org.springframework.stereotype.Component;

/**
 * @author Pursuexy
 * @date 2021/7/16 21:56
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String payemntInfo_OK(Integer id) {
        return "------PaymentFallbackService  ----fall -----payemntInfo_OK---";
    }

    @Override
    public String payemntInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService  ----fall -----payemntInfo_TimeOut---";
    }
}
