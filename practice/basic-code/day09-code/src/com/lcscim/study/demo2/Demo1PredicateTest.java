package com.lcscim.study.demo2;

import java.util.function.Predicate;

public class Demo1PredicateTest {
    public static void main(String[] args) {
        /*method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });*/
        method(s -> s.length() > 5);
    }

    private static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.test("HelloWorld");
        System.out.println("字符串很长吗" + veryLong);
    }
}
