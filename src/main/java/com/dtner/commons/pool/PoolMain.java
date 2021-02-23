package com.dtner.commons.pool;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/**
 * @ClassName PoolMain
 * @Description:
 * @Author dt
 * @Date 2020-09-14
 **/
public class PoolMain {

    public static void main(String[] args) throws Exception {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        GenericObjectPoolConfig<ConnectionDomain> config = new GenericObjectPoolConfig<>();
        config.setMaxTotal(5);
        config.setMaxWaitMillis(1000);

        ConnectionPool connectionPool = new ConnectionPool(connectionFactory, config);
        for (int i = 0; i < 7; i++) {
            ConnectionDomain con = connectionPool.borrowObject();

            System.out.println("状态: "+ con.getId());

//            connectionPool.returnObject(con);

        }

    }

}
