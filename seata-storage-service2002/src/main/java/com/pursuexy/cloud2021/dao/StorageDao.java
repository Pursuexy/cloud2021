package com.pursuexy.cloud2021.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pursuexy
 * @date 2021/7/20 18:36
 **/
@Mapper
public interface StorageDao {
    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
