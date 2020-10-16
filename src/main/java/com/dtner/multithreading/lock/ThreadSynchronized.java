package com.dtner.multithreading.lock;

/**
 * @ClassName ThreadSyn
 * @Description:
 * @Author dt
 * @Date 2020-10-16
 **/
public class ThreadSynchronized {

    private int i = 0;

    private byte[] lock = new byte[0];

    public synchronized void incr() {

        try{
            i++;
            System.out.println(i);
            wait();
            System.out.println("等待");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public synchronized void unIncr(){
        notifyAll();
        System.out.println("释放");
    }


    /**
     * 对象锁
     */
    public void synIncr(){

        synchronized (lock){
            incr();
        }

    }

}
