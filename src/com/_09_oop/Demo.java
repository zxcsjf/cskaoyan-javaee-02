package com._09_oop;

/**
 * 静态成员变量，类加载
 *
 * @author zxcsjf
 * @since 2022/06/13 12:58
 */
public class Demo {
    static Cat cat = new Cat(); // 0.默认初始化 null 1. 显式赋值
    Dog dog = new Dog(); // 8. new Demo()时，成员变量初始化
    Dog dog2;
    static Dog dog3; // 0. 默认初始化 null

    public static void main(String[] args) {
        System.out.println("hello world!"); // 5.
        Demo d = new Demo(); // 6.已经类加载过了，调用无参构造器
    } // END

    public Demo() { // 7.
        System.out.println("demo"); // 10.
    }
}

class Cat {
    static Dog dog = new Dog(); // 2.

    public Cat() {
        System.out.println("cat"); // 4.
    }
}

class Dog {
    public Dog() { // 9.
        System.out.println("dog"); // 3.
    }
}