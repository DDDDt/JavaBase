package com.dtner.multithreading.safecollection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ThreadMap
 * @Description: 线程安全的 Map
 * @Author dt
 * @Date 2020-10-19
 **/
public class ThreadMap {

    public static void main(String[] args) {


        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();


        new Thread(() -> map.put("1","1")).start();


    }

}
