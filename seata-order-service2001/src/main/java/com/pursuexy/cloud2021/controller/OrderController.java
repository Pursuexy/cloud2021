package com.pursuexy.cloud2021.controller;

import com.pursuexy.cloud2021.domain.CommonResult;
import com.pursuexy.cloud2021.domain.Order;
import com.pursuexy.cloud2021.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Pursuexy
 * @date 2021/7/20 18:06
 **/
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
