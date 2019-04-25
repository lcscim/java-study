package com.lcscim.study.demo3;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        Usb usbMouse = new Mouse();
        computer.useDevice(usbMouse);
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
