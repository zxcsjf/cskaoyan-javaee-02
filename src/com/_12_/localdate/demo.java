package com._12_.localdate;


import java.time.LocalDate;

/**
 * @author zxcsjf
 * @since 2022/06/16 14:16
 */
public class demo {
    public static void main(String[] args) {
        // System.out.println(Test.NUM);
       // LocalDate bir = LocalDate.of(1999,9,20);
        collectAnimalShout(new Cat());
        Cat cat = new Cat();
        Animal animal = new Animal();
        System.out.println(animal instanceof Cat);
        System.out.println(cat instanceof Animal);
    }

    public static void collectAnimalShout(Animal animal) {
        animal.test();
    }
}

class Animal {
    public void test() {
        System.out.println("我会叫！");
    }
}

class Cat extends Animal {
    @Override
    public void test() {
        System.out.println("喵喵喵！！！");
    }
}

class Dog extends Animal {
    @Override
    public void test() {
        System.out.println("汪汪汪！！！");
    }
}