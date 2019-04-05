package com.lcscim.practice.demo3;

import java.util.Scanner;

public class ScammerSum {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("请输入数字1：");
        int a = sc1.nextInt();
        System.out.print("请输入数字2：");
        int b = sc1.nextInt();
        int sum = a + b;
        System.out.println("和为：" + sum);
    }
}
