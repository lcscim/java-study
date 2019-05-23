package com.lcscim.study.demo2;

import java.util.function.Consumer;

public class Demo1ConsumerAndThen {
    public static void main(String[] args) {
        /*consumeString(new Consumer<String>() {
            @Override
            public void accept(String s) {

                System.out.println(s.toUpperCase());
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        });*/
        consumeString(s -> System.out.println(s.toUpperCase()), s -> System.out.println(s.toLowerCase()));
    }

    private static void consumeString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("Hello");
    }
}
