package com.lcscim.study.demo2;

import java.util.function.Predicate;

public class Demo3PredicateTest {
    public static void main(String[] args) {
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("H");
            }
        }, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("W");
            }
        });
        method(s -> s.contains("h"),
               s -> s.contains("w"));
    }

    private static void method(Predicate<String> one, Predicate<String> two) {
        boolean veryLong = one.or(two).test("HelloWorld");
        System.out.println("符合要求吗" + veryLong);
    }
}
