package com.lcscim.study.demo1;

import java.io.FileWriter;
import java.io.IOException;

public class FWWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fw.txt",true);
        /*fw.write('刷');
        fw.flush();
        fw.write('新');
        fw.flush();
        fw.write('关');
        //fw.close();
        fw.flush();
        fw.write('闭');
        fw.close();*/
        char[] chars = "大家好才是真的好".toCharArray();
        fw.write(chars);
        fw.write(chars,2,2);
        fw.close();
    }
}
