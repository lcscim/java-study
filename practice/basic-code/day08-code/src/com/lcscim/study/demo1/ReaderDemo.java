package com.lcscim.study.demo1;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"),"GBK");
        int read;
        while ((read = isr.read())!=-1){
            System.out.println((char)read);
        }
        isr.close();
    }
}
