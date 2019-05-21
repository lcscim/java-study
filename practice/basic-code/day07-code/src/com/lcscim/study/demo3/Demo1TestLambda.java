package com.lcscim.study.demo3;

public class Demo1TestLambda {
    public static void main(String[] args) {
        /*Cook cook = new Cook() {
            @Override
            public void makeFood() {
                System.out.println("makelunch");
            }
        };
        invokeCook(cook);*/
        invokeCook(() -> System.out.println("makelunch"));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
