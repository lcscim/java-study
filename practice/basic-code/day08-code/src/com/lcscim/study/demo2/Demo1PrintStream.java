package com.lcscim.study.demo2;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo1PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(97);
        PrintStream printStream = new PrintStream("a.txt");
        System.setOut(printStream);
        System.out.println(97);
    }
}
