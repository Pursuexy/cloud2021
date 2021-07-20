package com.pursuexy.cloud2021.service.impl;

import com.pursuexy.cloud2021.entities.CommonResult;
import com.pursuexy.cloud2021.entities.Payment;
import com.pursuexy.cloud2021.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author Pursuexy
 * @date 2021/7/20 14:33
 **/
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult paymentSQL(Long id) {
        return new CommonResult(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
