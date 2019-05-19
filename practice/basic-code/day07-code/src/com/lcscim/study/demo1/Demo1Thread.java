package com.lcscim.study.demo1;

public class Demo1Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread("新的线程！");
        mt.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程!" + i);
        }
    }
}
