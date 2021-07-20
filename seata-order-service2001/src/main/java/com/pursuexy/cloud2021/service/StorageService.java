package com.pursuexy.cloud2021.service;

import com.pursuexy.cloud2021.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Pursuexy
 * @date 2021/7/20 18:04
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    /**
     * 扣减库存
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
