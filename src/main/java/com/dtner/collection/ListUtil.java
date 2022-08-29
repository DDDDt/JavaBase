package com.dtner.collection;

import java.util.*;

/**
 * @description: List 服务
 * @author: dt
 * @create: 2022-08-11 10:26
 */
public class ListUtil {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("123");
        linkedList.add("123");
        linkedList.addFirst("123");
        linkedList.remove("123");
        System.out.println(linkedList.toString());
        System.out.println(linkedList.poll());
        linkedList.push("123456");
        System.out.println(linkedList.poll());


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("123", "456");
        System.out.println(1 << 30);
        System.out.println(1^2);
        System.out.println(1 << 4);
        System.out.println(8 & 3);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("123", "456");

        /**
         * 排序的 map
         */
        TreeMap treeMap = new TreeMap();
        treeMap.put("123", "456");


    }

}
