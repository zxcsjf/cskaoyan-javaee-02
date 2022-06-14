package com._09_oop.classLoader;

/**
 * 类初始化
 *
 * @author zxcsjf
 * @since 2022/06/13 22:20
 */
public class Demo {
    static {
        System.out.println("Demo类开始初始化步骤了!"); // 1.
    }
    static Cat cat = new Cat(); // 2. // 18.  // 21.
    Dog dog = new Dog(); // 8.  // 11. // 25. // 28.
    public static void main(String[] args) {
        System.out.println("hello world!"); // 22.
        Demo d = new Demo(); // 23.  // 30.
    }  // END
    public Demo() { // 7. // 24.
        System.out.println("demo"); // 12. // 29.
    }
}

class Cat {
    static {
        System.out.println("Cat类开始初始化步骤了!"); // 3.
    }
    static Dog dog = new Dog(); // 4. // 14.  // 17.
    public Cat() { // 19.
        System.out.println("cat"); // 20.
    }
}

class Dog {
    static {
        System.out.println("Dog类开始初始化步骤了!"); // 5.
    }
    static Demo demo = new Demo(); // 6.  // 13.
    public Dog() { // 9. // 15.  // 26.
        System.out.println("dog"); // 10. // 16.  // 27.
    }
}
