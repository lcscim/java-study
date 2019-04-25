package com.lcscim.study.demo3;

public class Keyboard implements Usb {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void onClick(){
        System.out.println("点击键盘");
    }

}
