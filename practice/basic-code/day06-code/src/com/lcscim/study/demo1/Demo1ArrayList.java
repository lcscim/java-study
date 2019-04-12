package com.lcscim.study.demo1;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Random;

public class Demo1ArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(1000) + 1);
        }
        System.out.println(arrayList);
        ArrayList<Integer> list = getArrayList(arrayList);
        System.out.println(list);
    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
