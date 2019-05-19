package com.lcscim.study.demo1;

public class Ticket implements Runnable {
    private int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                synchronized (lock){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖：" + ticket--);
                }
            }
        }
    }
}
