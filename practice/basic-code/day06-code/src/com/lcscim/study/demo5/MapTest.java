package com.lcscim.study.demo5;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String scanner = new Scanner(System.in).nextLine();
        findChar(scanner);
    }

    private static void findChar(String scanner) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < scanner.length(); i++) {
            char c = scanner.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                map.put(c,++count);
            }
        }
        System.out.println(map);
    }
}
