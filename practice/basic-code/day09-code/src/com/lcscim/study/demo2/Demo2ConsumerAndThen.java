package com.lcscim.study.demo2;

import java.util.function.Consumer;

public class Demo2ConsumerAndThen {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        /*printInfo(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("姓名:"+s.split(",")[0]);
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("性别:"+s.split(",")[1]);
            }
        },array);*/
        printInfo(
                s -> System.out.println("姓名:"+s.split(",")[0]),
                s ->System.out.println("姓名:"+s.split(",")[1]),
                array);
    }

    private static void printInfo(Consumer<String> one, Consumer<String> two,String[] array) {
        for (String info : array) {
            one.andThen(two).accept(info);
        }
    }
}
