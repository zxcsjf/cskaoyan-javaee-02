package com._10_oop.homework;

/**
 * 当属性私有化，又有外界访问需求时，提供Getter/Setter方法
 *
 * 创建两个类，分别用来表示长方形和正方形。
 * 同时定义所需的成员变量（边长），
 * 代表长方形或者正方形的边长（私有化成员变量，并提供相应的Getter/Setter方法，获取以及改变长方形和正方形的边长。）
 *
 * 然后在两个类中分别定义两个成员方法，用于求对应图形的面积和周长。
 *
 * 最后，写代码测试一下创建对象，方法调用等。
 *
 * 注：Getter/Setter方法可以选择手写一个，其余的用快捷键自动生成。
 * 该题是纯粹语法练习，不要浪费时间。
 *
 * @author zxcsjf
 * @since 2022/06/14 21:14
 */
public class Homework7 {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(10);
        System.out.println(square.getSide());

        Rectangular rectangular = new Rectangular();
        rectangular.setLongSide(15);
        rectangular.setShortSide(5);
        System.out.println(rectangular.getLongSide());
        System.out.println(rectangular.getShortSide());
    }
}

class Square {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangular {
    private int longSide;
    private int shortSide;

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }
}
