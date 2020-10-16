package com.dtner.multithreading.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ThreadReentrantLock
 * @Description: ReentrantLock CAS和AQS队列
 * @Author dt
 * @Date 2020-10-16
 **/
public class ThreadReentrantLock {

    private static int i = 0;

    private static Lock lock = new ReentrantLock();

    private static Condition condition = lock.newCondition();

    public static void incre(){

        lock.lock();
        try{
            i++;
            System.out.println(i);
            condition.await();
            System.out.println("等待");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public static void unIncre(){
        lock.lock();
        try{
            System.out.println("释放");
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i1 = 0; i1 < 10; i1++) {
            executorService.execute(() -> incre());
            unIncre();
        }
    }

}
