package com.pursuexy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pursuexy
 * @date 2021/7/16 14:53
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();//随机策略
    }

}
