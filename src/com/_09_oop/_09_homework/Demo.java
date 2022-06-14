package com._09_oop._09_homework;

/**
 * 第一题第二问
 *
 * @author zxcsjf
 * @since 2022/06/13 19:22
 */
public class Demo {
    public static void main(String[] args) {

        Person p = new Person(18);
        System.out.println(p.age);
        System.out.println(Person.nationality);

        Person p2 = new Person("China");
        System.out.println(p2.age);
        System.out.println(Person.nationality);

        Person p1 = new Person();
        System.out.println(p1.age);
        System.out.println(Person.nationality);
    }
}

class Person {
    int age = 10;
    static String nationality = "美国";

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String nationality) {
        Person.nationality = nationality;
    }
}