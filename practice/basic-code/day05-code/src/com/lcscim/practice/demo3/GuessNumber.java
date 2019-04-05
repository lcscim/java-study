package com.lcscim.practice.demo3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int guessnumber = random.nextInt(101);
        for (int i = 10; i > 0; i--) {
            System.out.println("还有" + i + "次机会");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number > guessnumber) {
                System.out.println("大了");
            } else if (number < guessnumber) {
                System.out.println("小了");
            } else {
                System.out.println("对了");
                break;
            }

        }
    }
}
