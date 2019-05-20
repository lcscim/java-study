package com.lcscim.study.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Myrunnable r = new Myrunnable();
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.shutdown();
    }
}
