package com.lcscim.study.demo1;

public class Demo2Runnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread tr = new Thread(mr, "小强");
        tr.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("旺财" + i);
        }
    }
}
