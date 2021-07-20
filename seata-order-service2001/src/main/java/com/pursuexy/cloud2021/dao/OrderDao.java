package com.pursuexy.cloud2021.dao;

import com.pursuexy.cloud2021.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pursuexy
 * @date 2021/7/20 17:57
 **/
@Mapper
public interface OrderDao {
    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
