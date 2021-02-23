package com.dtner.commons.pool;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.AbandonedConfig;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/**
 * @ClassName ConnectionPool
 * @Description: 连接池
 * @Author dt
 * @Date 2020-09-14
 **/
public class ConnectionPool extends GenericObjectPool<ConnectionDomain> {

    public ConnectionPool(PooledObjectFactory<ConnectionDomain> factory) {
        super(factory);
    }

    public ConnectionPool(PooledObjectFactory<ConnectionDomain> factory, GenericObjectPoolConfig<ConnectionDomain> config) {
        super(factory, config);
    }

    public ConnectionPool(PooledObjectFactory<ConnectionDomain> factory, GenericObjectPoolConfig<ConnectionDomain> config, AbandonedConfig abandonedConfig) {
        super(factory, config, abandonedConfig);
    }
}
