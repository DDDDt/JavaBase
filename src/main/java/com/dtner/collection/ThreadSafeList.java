package com.dtner.collection;

import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName TestList
 * @Description:
 * @Author dt
 * @Date 2020-08-28
 **/
public class ThreadSafeList {

    public static void main(String[] args) {

        /**
         * ArrayList 的线程安全集合类
         */
        Vector<String> vector = new Vector<>();
        vector.addElement("1");
        vector.addElement("2");
        vector.addElement("3");
        vector.forEach(System.out::println);

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
        copyOnWriteArrayList.add("1");
        copyOnWriteArrayList.add("2");
        copyOnWriteArrayList.add("3");
        copyOnWriteArrayList.add("4");
        copyOnWriteArrayList.forEach(System.out::println);

    }

}
