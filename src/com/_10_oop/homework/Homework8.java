package com._10_oop.homework;

/**
 * 继承基础语法练习
 * <p>
 * 提供以下两个动物需要描述，请用你的知识来编写代码
 * 猫：姓名，年龄，颜色，可以叫，可以抓老鼠
 * 狗：姓名，年龄，性别，可以叫，可以看门
 * <p>
 * 分析这个案例，设计出合适的继承体系。
 * <p>
 * ​  最后思考：人类研究出来了机器人，它们也有姓名，年龄，颜色等属性，可以套用本题中的继承体系吗？
 *
 * @author zxcsjf
 * @since 2022/06/14 21:29
 */
public class Homework8 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("黄色");
        cat.catchMouse();

        Dog dog = new Dog();
        dog.setSex("公");
        dog.watchDoor();
    }
}

class Animal {
    private String name;
    private int age;

    public void bark() {
        System.out.println("叫！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat extends Animal {
    private String color;

    public void catchMouse() {
        System.out.println("我会抓老鼠！！");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Dog extends Animal {
    private String sex;

    public void watchDoor() {
        System.out.println("我会看门！！");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}