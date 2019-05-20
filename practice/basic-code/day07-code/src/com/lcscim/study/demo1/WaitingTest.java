package com.lcscim.study.demo1;

public class WaitingTest {
    public static Object obj = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        try {
                            System.out.println(Thread.currentThread().getName()+"===获取到锁对象，调用wait方法，进入waiting状态，释放锁对象");
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"===从waiting状态醒来，获取到锁对象继续执行");
                    }
                }
            }
        },"等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+"---等待3秒钟");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (obj){
                    System.out.println(Thread.currentThread().getName()+"---获取到锁对象调用notify方法，释放锁对象");
                    obj.notify();
                }
            }
        },"唤醒线程").start();
    }
}
