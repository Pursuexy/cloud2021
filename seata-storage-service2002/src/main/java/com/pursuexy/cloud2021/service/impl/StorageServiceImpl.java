package com.pursuexy.cloud2021.service.impl;

import com.pursuexy.cloud2021.dao.StorageDao;
import com.pursuexy.cloud2021.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * @author Pursuexy
 * @date 2021/7/20 18:34
 **/
@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
