package com.lcscim.study.demo1;

import java.util.function.Function;

public class FunctionApplyDemo1 {
    public static void main(String[] args) {
        method(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });
        method(s -> Integer.parseInt(s));
    }

    private static void method(Function<String, Integer> function) {
        int num = function.apply("10");
        System.out.println(num + 20);
    }
}
