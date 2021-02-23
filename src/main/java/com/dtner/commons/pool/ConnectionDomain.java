package com.dtner.commons.pool;

/**
 * @ClassName ConnectionDomain
 * @Description: 测试连接类
 * @Author dt
 * @Date 2020-09-14
 **/
public class ConnectionDomain {

    private Integer id;

    public ConnectionDomain(Integer id) {
        this.id = id;
        System.out.println("创建连接...");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ConnectionDomain{" +
                "id='" + id + '\'' +
                '}';
    }
}
