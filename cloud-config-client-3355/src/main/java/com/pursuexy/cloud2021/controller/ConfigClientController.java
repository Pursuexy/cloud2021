package com.pursuexy.cloud2021.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pursuexy
 * @date 2021/7/18 12:51
 **/
@RestController
@Slf4j
public class ConfigClientController {

    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
