package com.lcscim.practice.demo2;

public class Demo2Student {
    public static void main(String[] args) {
        Student student = new Student("lcscim", 20, true);
        System.out.println(student.getName() + student.getAge() + student.isMale());
    }
}
