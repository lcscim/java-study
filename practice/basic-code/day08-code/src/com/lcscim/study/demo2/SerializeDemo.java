package com.lcscim.study.demo2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "zhangsan";
        e.address = "beiqinglu";
        e.age = 20;
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
            out.writeObject(e);
            out.close();
            System.out.println("Serialized data is saved");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
