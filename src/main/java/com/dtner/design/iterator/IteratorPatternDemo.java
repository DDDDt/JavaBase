package com.dtner.design.iterator;

import com.dtner.design.iterator.impl.NameRepositoryImpl;
import com.dtner.design.iterator.iter.Iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {

        NameRepositoryImpl nameRepository = new NameRepositoryImpl();

        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            String name = (String) iterator.next();
            System.out.println("Name : "+name);
        }

    }

}
