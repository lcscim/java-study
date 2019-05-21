package com.lcscim.study.demo3;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2Comparator {
    public static void main(String[] args) {
        Person[] array = {new Person("古力娜扎", 19), new Person("迪丽热巴", 18), new Person("马尔扎哈", 20)};
        /*Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(array, comp);*/
        Arrays.sort(array, (Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        });
        for (Person person : array) {
            System.out.println(person.getName() + person.getAge());
        }
    }
}
