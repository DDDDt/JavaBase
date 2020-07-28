package com.dtner.design.singleton;

/**
 * @ClassName HungrySingleton
 * @Description: 饿汉式
 * 线程安全
 *在初始化的时候就会实例化
 * @Author dt
 * @Date 2020-07-28
 **/
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
