package com.dtner.multithreading.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName ThreadBlockQueue
 * @Description: 阻塞队列
 * @Author dt
 * @Date 2020-10-19
 **/
public class ThreadBlockQueue {

    private static BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    private static AtomicInteger productInt = new AtomicInteger(0);

    public static void main(String[] args) {

        // 生产者
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                queue.add(String.valueOf(productInt.getAndIncrement()));
            }).start();
        }

        // 消费者
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try{
                    System.out.println(queue.poll(1, TimeUnit.MINUTES));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }

    }

}
