package com.lcscim.study.demo2;

public class Demo1BaoZi {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);
        ch.start();
        bzp.start();
    }
}
