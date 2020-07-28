package com.dtner.design.singleton;

/**
 * @ClassName InnerClassSingleton
 * @Description: 静态内部类
 * 静态内部类具有延迟加载的功能
 * @Author dt
 * @Date 2020-07-28
 **/
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    public static final InnerClassSingleton getInstance(){
        return SinletonHolder.innerClass;
    }

    private static class SinletonHolder{
        private static final InnerClassSingleton innerClass = new InnerClassSingleton();
    }

}
