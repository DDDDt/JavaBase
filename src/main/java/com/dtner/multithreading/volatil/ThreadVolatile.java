package com.dtner.multithreading.volatil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadVolatile
 * @Description: Volatile 增加可见型
 * @Author dt
 * @Date 2020-10-16
 **/
public class ThreadVolatile {

    private static volatile boolean bol = true;

    public static void setFalBol(){
        System.out.println(bol);
        bol = false;
    }

    public static void setTrueBol(){
        System.out.println(bol);
        bol = true;
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(() -> setFalBol());

        executorService.execute(() -> setTrueBol());

    }


}
