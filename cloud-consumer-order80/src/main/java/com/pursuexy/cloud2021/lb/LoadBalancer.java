package com.pursuexy.cloud2021.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Pursuexy
 * @date 2021/7/16 15:28
 **/
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
