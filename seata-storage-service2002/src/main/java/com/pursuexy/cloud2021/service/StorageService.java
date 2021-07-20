package com.pursuexy.cloud2021.service;

/**
 * @author Pursuexy
 * @date 2021/7/20 18:34
 **/
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
