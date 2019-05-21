package com.lcscim.study.demo3;

import java.io.File;

public class Demo6DiGui {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\asus\\Desktop\\kaifa\\java-study\\practice");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()){
                if (file.getName().endsWith(".java")){
                    System.out.println("文件名:"+file.getAbsolutePath());
                }
            }else {
                printDir(file);
            }
        }
    }
}
