package com.dtner.multithreading.syn;

/**
 * @description:
 * @author: dt
 * @create: 2022-08-29 16:52
 */
public class TestSynchronized {

    public static void main(String[] args) {

        SynObject synObject = new SynObject();
        SynObject synObject1 = new SynObject();

        new Thread(synObject::testLockFirst).start();
        new Thread(synObject1::testLockSecondt).start();



    }

}
