package com.dtner.innerClass;

/**
 * @ClassName InnerClass
 * @Description: 普通内部类
 * @Author dt
 * @Date 2020-07-28
 **/
public class InnerClass {

    static {
        System.out.println("外部类静态代码块");
    }

    public InnerClass() {
        System.out.println("外部内构造方法");
    }

    class InnerNoClass{
        public InnerNoClass() {
            System.out.println("内部类。。。");
        }
    }
}
