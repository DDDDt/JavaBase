package com.dtner.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName TestThread
 * @Description: 创建线程
 * @Author dt
 * @Date 2020-10-15
 **/
public class TestThread {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 没有返回值
        new Thread(() -> {
            System.out.println("多线程");
        }).start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程...");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        

        // 带有返回值
        FutureTask<String> future = new FutureTask<>(() -> {
            System.out.println("123");
            return "123";
        });

        Thread t = new Thread(future);
        t.start();

        String result = future.get();

        System.out.println("result = "+result);

    }

}


