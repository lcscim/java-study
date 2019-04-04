package com.itheima.demo3;

public class DemoChange {
    public static void main(String[] args) {
        /*int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a,b);
        System.out.println(a);
        System.out.println(b);*/
        int[] arr = {1, 3, 5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] a) {
        /*a = a + b;
        b = b + a;*/
        a[0] = 10;
    }
}
