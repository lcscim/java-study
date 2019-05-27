package com.lcscim.study.demo1;

import java.lang.reflect.Field;

public class ClassDemo1 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------------------------------------");
        Person person = new Person();
        Field a = personClass.getField("a");
        Object o = a.get(person);
        System.out.println(o);
        System.out.println("--------------------------------------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("--------------------------------------");
        Field b = personClass.getDeclaredField("b");
        b.setAccessible(true);
        System.out.println(b.get(person));

    }
}
