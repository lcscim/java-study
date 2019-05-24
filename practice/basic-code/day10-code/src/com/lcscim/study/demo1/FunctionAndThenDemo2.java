package com.lcscim.study.demo1;

import java.util.function.Function;

public class FunctionAndThenDemo2 {
    public static void main(String[] args) {
        method(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s)+10;
            }
        }, new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return ""+integer;
            }
        });
    }

    private static void method(Function<String, Integer> one, Function<Integer, String> two) {
        String num = one.andThen(two).apply("123");
        System.out.println(num);
    }
}
