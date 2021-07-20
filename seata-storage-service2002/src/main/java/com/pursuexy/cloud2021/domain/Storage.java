package com.pursuexy.cloud2021.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pursuexy
 * @date 2021/7/20 18:32
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
