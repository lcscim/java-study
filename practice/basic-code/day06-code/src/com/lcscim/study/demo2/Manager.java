package com.lcscim.study.demo2;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int money, int count) {
        int leftmoney = getMoney();
        if (leftmoney < money) {
            return null;
        }
        setMoney(leftmoney - money);
        ArrayList<Integer> list = new ArrayList<>();
        int m = money / count;
        int l = money % count;
        for (int i = 0; i < count - 1; i++) {
            list.add(m);
        }
        list.add(m + l);
        return list;
    }
}
