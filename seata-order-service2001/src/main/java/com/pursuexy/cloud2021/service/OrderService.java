package com.pursuexy.cloud2021.service;

import com.pursuexy.cloud2021.domain.Order;

/**
 * @author Pursuexy
 * @date 2021/7/20 18:03
 **/
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
