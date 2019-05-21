package com.lcscim.study.demo3;

public class Demo4DiGui {
    public static void main(String[] args) {
        int num = 5;
//        int sum = getNum(num);
//        System.out.println(sum);
        int result = getResult(num);
        System.out.println(result);
    }

    private static int getResult(int num) {
        if (num == 2){
            return 2;
        }
        return num*getResult(num-1);
    }

/*    private static int getNum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getNum(num - 1);
    }*/
}
