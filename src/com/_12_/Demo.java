package com._12_;

/**
 * 219
 *
 * @author zxcsjf
 * @since 2022/06/16 11:02
 */
public class Demo {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son(300);
        Father fs = new Son(400);
    }
}


class Father {
    int num = 100;

    public int getNum() {

        return num;
    }

    public Father() {
        // 如果是子类对象，会调用子类成员方法，
        // 此时子类成员变量显式赋值和构造器还没执行
        System.out.println(getNum());
    }
}

class Son extends Father {
    int num = 200;

    @Override
    public int getNum() {

        return num;
    }

    public Son() {
    }

    public Son(int num) {
        this();
    }
}