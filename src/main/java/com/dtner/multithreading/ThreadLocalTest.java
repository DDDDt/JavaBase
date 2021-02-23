package com.dtner.multithreading;

/**
 * @ClassName ThreadLocalTest
 * @Description: Thread Local 本地线程内存
 * @Author dt
 * @Date 2021/2/23
 **/
public class ThreadLocalTest {

    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    static void print(String str){
        System.out.println(str + ": "+ threadLocal.get());
        // 清除
        threadLocal.remove();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("thread -1");
                print("thread1");
                System.out.println("after remove: " + threadLocal.get());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("thread -2");
                print("thread2");
                System.out.println("after remove: " + threadLocal.get());
            }
        });

        thread1.start();
        thread2.start();

    }

}
