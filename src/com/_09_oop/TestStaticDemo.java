package com._09_oop;

/**
 * @author zxcsjf
 * @since 2022/06/13 22:38
 */
public class TestStaticDemo {
    static int b = 777;
    static TestStaticDemo ts = new TestStaticDemo();

    int a = 666;

    static {
        System.out.println("静态代码块");
    }

    public TestStaticDemo() {
        System.out.println("无参构造器");
        System.out.println("a=" + a + ",b=" + b);
    }

    {
        System.out.println("构造代码块");
    }

    public static void staticMethod() {
        System.out.println("静态成员方法");
    }

    public static void main(String[] args) {
        staticMethod();
    }
}