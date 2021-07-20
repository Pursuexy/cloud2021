package com.pursuexy.cloud2021.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

/**
 * @author Pursuexy
 * @date 2021/7/20 17:47
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order{
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    /**
     * 订单状态：0：创建中；1：已完结
     */
    private Integer status;
}
