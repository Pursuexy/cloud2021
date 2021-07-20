package com.pursuexy.cloud2021.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.pursuexy.cloud2021.entities.CommonResult;

/**
 * @author Pursuexy
 * @date 2021/7/20 13:20
 **/
public class CustomerBlockHandler {

    public static CommonResult handleException1(BlockException exception){
        return new CommonResult(2020,"自定义的全局限流处理信息......CustomerBlockHandler");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的全局限流处理信息......CustomerBlockHandler");
    }
}
