package com.lcscim.study.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
         Employee a = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            a = (Employee)in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException c){
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        System.out.println("name:"+a.name);
        System.out.println("address:"+a.address);
        System.out.println("age:"+a.age);
    }
}
