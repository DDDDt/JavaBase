package com.dtner.multithreading.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadSynchronizedMain
 * @Description:
 * @Author dt
 * @Date 2020-10-16
 **/
public class ThreadSynchronizedMain {

    public static void main(String[] args) {

        ThreadSynchronized threadSynchronized = new ThreadSynchronized();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                threadSynchronized.incr();
            });
            threadSynchronized.unIncr();
        }

    }

}
