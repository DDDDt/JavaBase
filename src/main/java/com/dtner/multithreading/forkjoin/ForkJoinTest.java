package com.dtner.multithreading.forkjoin;

import java.util.concurrent.ForkJoinPool;

/**
 * @ClassName ForkJoinTest
 * @Description: Fork Join
 * @Author dt
 * @Date 2020-10-19
 **/
public class ForkJoinTest {

    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.getPoolSize());



    }

}
