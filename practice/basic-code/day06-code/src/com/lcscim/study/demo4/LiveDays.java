package com.lcscim.study.demo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LiveDays {
    public static void main(String[] args) throws ParseException {
        getLiveDays();
    }

    private static void getLiveDays() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String birthdayDateString = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        long birthdayDateTime = birthdayDate.getTime();
        long todayTime = new Date().getTime();
        long time = todayTime-birthdayDateTime;
        System.out.println(time/1000/60/60/24);
    }
}
