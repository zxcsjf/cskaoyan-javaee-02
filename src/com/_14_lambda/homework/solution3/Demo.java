package com._14_lambda.homework.solution3;

/**
 * @author zxcsjf
 * @since 2022/06/18 15:24
 */
public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog(12, "大黄", "yellow");
        dog.print();
    }
}

class Dog {
    private int age;
    private String name;
    private Body body;

    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.body = new Body(color);
    }

    // 成员内部类
    private class Body {
        String color;

        public Body() {
        }

        private Body(String color) {
            this.color = color;
        }
    }

    public void print() {
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("color = " + body.color);
    }
}