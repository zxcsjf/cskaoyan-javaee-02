package com._14_lambda.test;

import java.util.Random;

/**
 * @author zxcsjf
 * @since 2022/06/19 21:38
 */
public class RandonDemo {
    public static void main(String[] args) throws Throwable {
        // Random random = new Random();
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char) (random.nextInt(26) + 'a');
        //     System.out.print(ch);
        // }
        RandonDemo randonDemo = new RandonDemo();
        randonDemo = null;
        A a = new A();
        a = null;
        Thread.sleep(5000);

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Demo 类对象执行了垃圾回收！");
    }
}

class A {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("A 类对象执行了垃圾回收！");

    }
}