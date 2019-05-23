package com.lcscim.study.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo2Pro {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("read.txt"));
        Set<String> strings = pro.stringPropertyNames();
        for (String key : strings) {
            System.out.println(key+" -- "+ pro.getProperty(key));
        }
    }
}
