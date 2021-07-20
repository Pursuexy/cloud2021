package com.pursuexy.cloud2021.controller;

import com.pursuexy.cloud2021.domain.CommonResult;
import com.pursuexy.cloud2021.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Pursuexy
 * @date 2021/7/20 21:17
 **/
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
