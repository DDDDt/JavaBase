package com.dtner.design.singleton;

/**
 * @ClassName SluggardSafeSingleton
 * @Description: 懒汉式线程安全
 *
 * 线程安全的
 *
 * @Author dt
 * @Date 2020-07-28
 **/
public class SluggardSafeSingleton {

    private static SluggardSafeSingleton sluggardSafeSingleton;

    private SluggardSafeSingleton() {
    }

    public static synchronized SluggardSafeSingleton getInstance(){
        if (sluggardSafeSingleton == null){
            sluggardSafeSingleton = new SluggardSafeSingleton();
        }
        return sluggardSafeSingleton;
    }

}
