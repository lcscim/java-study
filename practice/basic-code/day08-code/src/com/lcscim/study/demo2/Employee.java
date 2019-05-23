package com.lcscim.study.demo2;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int age;

    public void addressCheck() {
        System.out.println("Address Check:" + name + "--" + address);
    }
}
