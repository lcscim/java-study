package com.lcscim.study.demo2;

import java.util.ArrayList;
import java.util.Random;

public class Qy extends User {
    public Qy() {
    }

    public Qy(String name, int money) {
        super(name, money);
    }

    public void oHb(ArrayList<Integer> list) {
        int index = (new Random()).nextInt(list.size());
        int money = list.remove(index);
        setMoney(money);
    }
}
