package com.lcscim.study.demo5;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> pokerBox = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♣");
        colors.add("♠");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
        Collections.shuffle(pokerBox);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if (i>=51){
                dipai.add(card);
            }else {
                if (i%3==0){
                    player1.add(card);
                }else if (i%3==1){
                    player2.add(card);
                }else if (i%3==2){
                    player3.add(card);
                }
            }
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
