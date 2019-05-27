package com.lcscim.study.demo1;

import java.lang.reflect.Constructor;

public class ClassDemo2 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("-------------------------------------");
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person person = constructor.newInstance("张三", 23);
        System.out.println(person);
        System.out.println("-------------------------------------");
        Constructor<Person> constructor1 = personClass.getConstructor();
        Person person1 = constructor1.newInstance();
        System.out.println(person1);
        System.out.println("-------------------------------------");
        Person person2 = personClass.newInstance();//空参构造方法可直接用class类，对象名.newInstance()调用
        System.out.println(person2);
        System.out.println("-------------------------------------");
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }
}
