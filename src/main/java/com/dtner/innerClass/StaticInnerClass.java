package com.dtner.innerClass;

/**
 * @ClassName StaticInnerClass
 * @Description: 静态内部类
 * @Author dt
 * @Date 2020-07-28
 **/
public class StaticInnerClass {

    static{
        System.out.println("外部代码静态代码块");
    }

    public StaticInnerClass() {
        System.out.println("外部类构造方法");
    }

    static class InnerClass{
        public InnerClass() {
            System.out.println("静态内部类初始化");
        }
    }
}
