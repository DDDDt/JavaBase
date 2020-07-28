package com.dtner.design.singleton;

/**
 * @ClassName SluggardUnsafeSingleton
 * @Description: 懒汉式线程非安全的
 *
 * 主要是通过构建私有的构造函数来实现的
 *
 * @Author dt
 * @Date 2020-07-28
 **/
public class SluggardUnsafeSingleton {

    private static SluggardUnsafeSingleton sluggardUnsafeSingleton;

    private SluggardUnsafeSingleton() {
    }

    public static SluggardUnsafeSingleton getInstance(){
        if(sluggardUnsafeSingleton == null){
            sluggardUnsafeSingleton = new SluggardUnsafeSingleton();
        }
        return sluggardUnsafeSingleton;
    }

}
