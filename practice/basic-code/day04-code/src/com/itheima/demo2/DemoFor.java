package com.itheima.demo2;

public class DemoFor {
    public static void main(String[] args) {
        System.out.println(getsum());
    }

    public static int getsum(){
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result = result + i;
        }
        return result;
    }
}
