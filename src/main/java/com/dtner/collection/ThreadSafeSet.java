package com.dtner.collection;

import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @program: Java-Base
 * @description:
 * @author: dt
 * @create: 2022-03-07
 **/
public class ThreadSafeSet {

    public static void main(String[] args) {

        /**
         * 线程安全的 set 集合
         */
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.forEach(System.out::println);

    }

}
