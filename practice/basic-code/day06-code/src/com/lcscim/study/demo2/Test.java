package com.lcscim.study.demo2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 200);
        ArrayList<Integer> list = manager.send(20, 3);
        if (list == null) {
            System.out.println("大兄弟，钱不够了");
        }
        Qy qy1 = new Qy("张三",0);
        Qy qy2 = new Qy("李四",0);
        Qy qy3 = new Qy("王五",0);

        manager.show();
        qy1.show();
        qy2.show();
        qy3.show();

        qy1.oHb(list);
        qy2.oHb(list);
        qy3.oHb(list);

        System.out.println("==================");
        manager.show();
        qy1.show();
        qy2.show();
        qy3.show();
    }
}
