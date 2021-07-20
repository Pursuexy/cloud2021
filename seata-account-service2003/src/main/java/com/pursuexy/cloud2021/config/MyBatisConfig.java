package com.pursuexy.cloud2021.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pursuexy
 * @date 2021/7/20 18:08
 **/
@Configuration
@MapperScan({"com.pursuexy.cloud2021.dao"})
public class MyBatisConfig {
}
