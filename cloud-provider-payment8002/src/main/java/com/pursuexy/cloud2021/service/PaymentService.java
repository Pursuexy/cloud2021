package com.pursuexy.cloud2021.service;

import com.pursuexy.cloud2021.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pursuexy
 * @date 2021/7/16 7:00
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
