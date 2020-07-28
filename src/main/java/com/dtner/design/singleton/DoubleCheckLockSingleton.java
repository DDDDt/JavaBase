package com.dtner.design.singleton;

/**
 * @ClassName DoubleCheckLockSingleton
 * @Description: 双重校验锁
 *
 * 使用 volatile
 * 判断为空后，使用 synchronized 锁定
 *
 * @Author dt
 * @Date 2020-07-28
 **/
public class DoubleCheckLockSingleton {

    private static byte[] lcok = new byte[0];

    private volatile static DoubleCheckLockSingleton singleton;

    private DoubleCheckLockSingleton() {
    }
    public static DoubleCheckLockSingleton getInstance(){
        if(singleton == null){
            synchronized (lcok){
                singleton = new DoubleCheckLockSingleton();
            }
        }
        return singleton;
    }

}
