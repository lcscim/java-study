package com.lcscim.study.demo1;

import java.util.function.Function;

public class FunctionAndThenDemo1 {
    public static void main(String[] args) {
        method(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s) + 10;
            }
        }, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer *= 10;
            }
        });
    }

    private static void method(Function<String, Integer> one, Function<Integer, Integer> two) {
        int num = one.andThen(two).apply("10");
        System.out.println(num + 20);
    }
}
