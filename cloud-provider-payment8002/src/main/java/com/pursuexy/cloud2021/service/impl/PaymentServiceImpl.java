package com.pursuexy.cloud2021.service.impl;

import com.pursuexy.cloud2021.dao.PaymentDao;
import com.pursuexy.cloud2021.entities.Payment;
import com.pursuexy.cloud2021.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Pursuexy
 * @date 2021/7/16 7:01
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
