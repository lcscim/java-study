package com.lcscim.study.demo3;

public class Computer {
    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    public void useDevice(Usb usb) {
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.onClick();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.onClick();
        }
        usb.close();
    }
}
