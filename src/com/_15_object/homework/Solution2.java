package com._15_object.homework;

/**
 * @author zxcsjf
 * @since 2022/06/20 19:27
 */
public class Solution2 {
//     public static void main(String[] args) {
//         A a = new A();
//         A a2 = new A();
//         B b = new B();
//
//         Class aClass = a.getClass();
//         Class aClass2 = a2.getClass();
//         Class bClass = b.getClass();
//
//         // Operator '==' cannot be applied to
//         // 'java.lang.Class<capture<? extends com._15_object.homework.A>>',
//         // 'java.lang.Class<capture<? extends com._15_object.homework.B>>'
//         System.out.println(aClass == bClass);
//         System.out.println(aClass == aClass2);
//     }
// }
//
// class A {
//
// }
//
// class B {
//
// }

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        Class<? extends A> aClazz1 = a.getClass();
        Class aClazz2 = a1.getClass();

        //快捷键 ctrl+alt+左右键 前进和后退光标所在的位置
        String n1 = aClazz1.getName();
        String n2 = aClazz2.getName();
        System.out.println(n1.equals(n2)); //比较的是内容
        System.out.println(n1 == n2); //比较的是地址

        B b = new B();
        Class<? extends B>  bClazz = b.getClass();
        System.out.println(aClazz2 == bClazz);
        /*
            双等号连接引用时必须是同种类型的引用
            而Java泛型是一个编译上的概念，如果泛型不同，编译器认为不是同种类型
         */
        String str = "123";
        // System.out.println(str == a);
        Class<? extends A> aClass = a.getClass();
        Class<? extends B> aClass1 = b.getClass();
        // System.out.println(a.getClass() == b.getClass());

    }
}

class A {
}

class B {
}