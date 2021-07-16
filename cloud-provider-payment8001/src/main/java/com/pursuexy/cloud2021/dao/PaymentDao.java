package com.pursuexy.cloud2021.dao;

import com.pursuexy.cloud2021.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pursuexy
 * @date 2021/7/15 19:30
 **/
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
