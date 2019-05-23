package com.lcscim.study.demo1;

import java.util.Properties;
import java.util.Set;

public class Demo1Pro {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("filename","a.txt");
        properties.setProperty("length","209385038");
        properties.setProperty("location","C:\\a.txt");
        System.out.println(properties);
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));
        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            System.out.println(key+" -- "+properties.getProperty(key));
        }
    }
}
