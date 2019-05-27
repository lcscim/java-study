package com.lcscim.study.demo2;

public class Demo01ToUpper {
    public static void main(String[] args) {
        method(new Porper() {
            @Override
            public void printCase(String s) {
                StringUpperCase upperCase = new StringUpperCase();
                upperCase.method(s);
            }
        });
        method((s) -> {
            StringUpperCase upperCase = new StringUpperCase();
            upperCase.method(s);
        });
        StringUpperCase upperCase = new StringUpperCase();
        method(upperCase::method);
    }

    private static void method(Porper porper) {
        porper.printCase("Hello");
    }
}
