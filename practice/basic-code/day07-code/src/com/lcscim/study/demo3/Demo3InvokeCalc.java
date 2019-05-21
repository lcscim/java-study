package com.lcscim.study.demo3;

public class Demo3InvokeCalc {
    public static void main(String[] args) {
        /*incokeCalc(1, 2, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });*/
        incokeCalc(1, 2, (int a, int b) -> {
            return a + b;
        });
    }

    private static void incokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
