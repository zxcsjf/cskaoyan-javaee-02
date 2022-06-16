package com._12_.homework.solution7;

/**
 * 给出三个层级的继承关系
 * 顶层父类Grandfather，Father继承Grandfather，Son继承Father
 * 成员变量：
 * Grandfather：gA,a
 * Father：fA,a
 * Son：sA,a
 * <p>
 * 成员方法：
 * Grandfather：testGrand,test
 * Father：testFather,test
 * Son：testSon,test
 * <p>
 * 使用快捷键在Son中生成不同的构造方法，调用不同的父类构造器（需要先生成父类相应的构造器）
 * 随后使用多种方式创建Son对象，测试对象名访问成员的机制，理解属性隐藏和方法覆盖。
 *
 * @author zxcsjf
 * @since 2022/06/16 20:34
 */
public class Demo {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        gf.test();

        Father f = new Son();
        f.testFather();
        f.test();

        Son s = new Son();
        s.test();
    }
}

class Grandfather {
    int gA;
    int a;

    public Grandfather() {
    }

    public Grandfather(int gA, int a) {
        this.gA = gA;
        this.a = a;
    }

    public void testGrand() {
        System.out.println("testGrand方法");
    }

    public void test() {
        System.out.println("Grandfather的test方法");
    }
}

class Father extends Grandfather {
    int fA;
    int a;

    public Father() {
    }

    public Father(int fA, int a) {
        this.fA = fA;
        this.a = a;
    }

    public Father(int gA, int a, int fA, int a1) {
        super(gA, a);
        this.fA = fA;
        this.a = a1;
    }

    public void testFather() {
        System.out.println("testFather方法");
    }

    @Override
    public void test() {
        System.out.println("Father的test方法");
    }
}

class Son extends Father {
    int sA;
    int a;

    public Son() {
    }

    public void testSon() {
        System.out.println("testSon!!!");
    }

    public Son(int sA, int a) {
        this.sA = sA;
        this.a = a;
    }

    public Son(int gA, int a, int fA, int a1, int sA, int a2) {
        super(gA, a, fA, a1);
        this.sA = sA;
        this.a = a2;
    }

    @Override
    public void testGrand() {
        super.testGrand();
    }

    @Override
    public void testFather() {
        super.testFather();
    }

    @Override
    public void test() {
        System.out.println("testson!!!");
    }
}
