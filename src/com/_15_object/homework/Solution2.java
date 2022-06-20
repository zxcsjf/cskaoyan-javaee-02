package com._15_object.homework;

/**
 * @author zxcsjf
 * @since 2022/06/20 19:27
 */
public class Solution2 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        B b = new B();

        Class aClass = a.getClass();
        Class aClass2 = a2.getClass();
        Class bClass = b.getClass();

        // Operator '==' cannot be applied to
        // 'java.lang.Class<capture<? extends com._15_object.homework.A>>',
        // 'java.lang.Class<capture<? extends com._15_object.homework.B>>'
        System.out.println(aClass == bClass);
        System.out.println(aClass == aClass2);
    }
}

class A {

}

class B {

}