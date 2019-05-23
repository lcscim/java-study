package com.lcscim.study.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo5PredicateTest {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
        List<String> list = method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "女".equals(s.split(",")[1]);
            }
        }, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.split(",")[0].length() == 4;
            }
        }, array);
        System.out.println(list);
        System.out.println(method(s -> "女".equals(s.split(",")[1]),
                s -> s.split(",")[0].length() == 4,array));
    }

    private static List<String> method(Predicate<String> one, Predicate<String> two, String[] array) {
        List<String> list = new ArrayList<>();
        for (String s : array) {
            boolean veryLong = one.and(two).test(s);
            if(veryLong){
                list.add(s);
            }
        }
        return list;
    }
}
