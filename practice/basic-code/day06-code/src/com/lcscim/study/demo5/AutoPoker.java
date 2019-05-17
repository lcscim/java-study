package com.lcscim.study.demo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class AutoPoker {
    public static void main(String[] args) {
        //1.组扑克牌
        //1.1 创建hashmap对象储存一套牌
        HashMap<Integer, String> pokerMap = new HashMap<>();
        //1.2 创建列表分别储存花色集合和数字集合
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        //1.3 使用Collections的addAll将所有花色和所有数字分别添加对应的集合中
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers,
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        //1.4 设置存储标号起始位置
        int count = 1;
        //1.5 使用hashmap的put方法添加大小王的键值
        pokerMap.put(count++, "大王");
        System.out.println(count);
        pokerMap.put(count++, "小王");
        System.out.println(count);
        //1.6 迭代颜色和数字将其组合起来并添加到hashmap对象中
        for (String number : numbers) {
            for (String color : colors) {
                String card = number + color;
                pokerMap.put(count++, card);
            }
        }
        //2 将54张牌顺序打乱
        //2.1 使用hashmap的keyset方法获取所有键
        Set<Integer> numberSet = pokerMap.keySet();
        //2.2 创建新的列表用来存储打乱顺序后的列表
        ArrayList<Integer> numberList = new ArrayList<>();
        //2.3 添加
        numberList.addAll(numberSet);
        //2.4 打乱
        Collections.shuffle(numberList);
        //3 发牌的编号
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> dipaiNO = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);
            if (i >= 51) {
                dipaiNO.add(no);
            } else {
                if (i % 3 == 0) {
                    noP1.add(no);
                } else if (i % 3 == 1) {
                    noP2.add(no);
                } else {
                    noP3.add(no);
                }
            }
        }
        //4.排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(dipaiNO);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (Integer integer : noP1) {
            String card = pokerMap.get(integer);
            player1.add(card);
        }
        for (Integer integer : noP2) {
            String card = pokerMap.get(integer);
            player2.add(card);
        }
        for (Integer integer : noP3) {
            String card = pokerMap.get(integer);
            player3.add(card);
        }
        for (Integer integer : dipaiNO) {
            String card = pokerMap.get(integer);
            dipai.add(card);
        }
        System.out.println("郭靖:" + player1);
        System.out.println("黄蓉:" + player2);
        System.out.println("杨过:" + player3);
        System.out.println("小龙女:" + dipai);
    }
}
