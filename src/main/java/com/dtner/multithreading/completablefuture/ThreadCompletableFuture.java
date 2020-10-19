package com.dtner.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @ClassName ThreadCompletableFuture
 * @Description: CompletableFuture 异步执行
 * @Author dt
 * @Date 2020-10-19
 **/
public class ThreadCompletableFuture {

    public static void main(String[] args) {

        CompletableFuture.runAsync(() -> System.out.println("异步执行..."));

    }

}
