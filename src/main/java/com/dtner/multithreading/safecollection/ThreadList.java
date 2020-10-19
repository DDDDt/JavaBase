package com.dtner.multithreading.safecollection;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName ThreadList
 * @Description:
 * @Author dt
 * @Date 2020-10-19
 **/
public class ThreadList {

    public static void main(String[] args) {


        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        list.forEach(System.out::println);

    }

}
