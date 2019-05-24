package com.lcscim.study.demo1;

import java.util.function.Function;

public class Demo1Function {
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        method(str, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[1];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 100;
            }
        });
        method(str,s -> s.split(",")[1],s -> Integer.parseInt(s),integer -> integer + 100);
    }

    private static void method(String s, Function<String, String> one, Function<String, Integer> two, Function<Integer, Integer> three) {
        int num = one.andThen(two).andThen(three).apply(s);
        System.out.println(num);
    }
}
