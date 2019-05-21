package com.lcscim.study.demo3;

import java.io.File;
import java.io.FileFilter;

public class Demo7DiGui {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\asus\\Desktop\\kaifa\\java-study\\practice");
        printDir(dir);
    }

    private static void printDir(File dir) {
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });*/
        File[] files = dir.listFiles(f->f.getName().endsWith(".java")||f.isDirectory());
        for (File file : files) {
            if (file.isFile()){
                System.out.println("文件名："+file.getAbsolutePath());
            }else {
                printDir(file);
            }
        }
    }
}
