package com.dtner.commons.pool;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName ConnectionFactory
 * @Description:
 * @Author dt
 * @Date 2020-09-14
 **/
public class ConnectionFactory extends BasePooledObjectFactory<ConnectionDomain> {

    private AtomicInteger idCount = new AtomicInteger();

    /**
     * 创建连接
     * @return
     * @throws Exception
     */
    @Override
    public ConnectionDomain create() throws Exception {
        return new ConnectionDomain(idCount.getAndAdd(1));
    }

    @Override
    public PooledObject<ConnectionDomain> wrap(ConnectionDomain con) {
        return new DefaultPooledObject(con);
    }
}
