package com.lcscim.practice.demo3;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个值：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个值：");
        int b = scanner.nextInt();
        System.out.println("请输入第三个值：");
        int c = scanner.nextInt();
        int temp = (a > b ? a : b);
        int max = (temp > c ? temp : c);
        System.out.println("最大值为：" + max);

    }
}
