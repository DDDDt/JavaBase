package com.dtner.collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @program: Java-Base
 * @description: 线程安全的 map
 * @author: dt
 * @create: 2022-03-07
 **/
public class ThreadSafeMap {

    public static void main(String[] args) {

        /**
         * 线程安全的集合, k 无序的
         */
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        hashMap.put("3", "3");
        hashMap.put("4", "4");
        hashMap.forEach((k,v) -> System.out.println(k +" -> "+ v));

        /**
         * 程安全的集合, k 有序的
         */
        ConcurrentSkipListMap<String, String> skipListMap = new ConcurrentSkipListMap<>();
        skipListMap.put("1", "1");
        skipListMap.put("2", "2");
        skipListMap.put("3", "3");
        skipListMap.put("4", "4");
        skipListMap.forEach((k,v) -> System.out.println(k +" -> "+ v));

    }

}
