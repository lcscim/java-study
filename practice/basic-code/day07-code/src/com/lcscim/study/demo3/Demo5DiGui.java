package com.lcscim.study.demo3;

import java.io.File;

public class Demo5DiGui {
    public static void main(String[] args) {
        File dir = new File("C:\\mysql5.7.21");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()){
                System.out.println("文件名："+file.getAbsolutePath());
            }else {
                System.out.println("目录："+file.getAbsolutePath());
                printDir(file);
            }
        }
    }
}
