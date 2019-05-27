package com.lcscim.study.demo2;

public class Demo01Calc {
    public static void main(String[] args) {
        int num = method(-10, new Calcable() {
            @Override
            public int calc(int num) {
                return Math.abs(num);
            }
        });
        System.out.println(num);
        int num1 = method(-10,Math::abs);
        System.out.println(num1);
    }

    private static int method(int num,Calcable calcable) {
        return calcable.calc(num);
    }
}
