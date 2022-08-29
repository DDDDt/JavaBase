package com.dtner.multithreading.syn;

/**
 * @description: synchronized 锁
 * @author: dt
 * @create: 2022-08-29 16:52
 */
public class SynObject {

    /**
     * 锁的是这一个变量对象，如果是 static 修饰的，所有的都会共享这一个，不是 static 修饰，同一个实例里所有方法都会共享这一个变量对象
     */
    private static final byte[] lock = new byte[0];

    public void testLockFirst() {
        synchronized (lock) {
            try {
                int i = 0;
                while (i < 100) {
                    Thread.sleep(1000L);
                    System.out.println("线程1 循环次数："+ (i+1));
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void testLockSecondt() {
        synchronized (lock) {
            try {
                int i = 0;
                while (i < 100) {
                    Thread.sleep(1000L);
                    System.out.println("线程2 循环次数："+ (i+1));
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
