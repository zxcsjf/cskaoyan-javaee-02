package com.cskaoyan.b;

import com.cskaoyan.a.MyClazz;

/**
 * test
 *
 * @author zxcsjf
 * @since 2022/06/13 20:53
 */
// 同时在com.cskaoyan.b包下定义一个Test类如下：
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        // A a = new A();
        // a.clone();

        Test test = new Test();
        test.clone();
        // MyClazz mc = new MyClazz();

        // MyClazz myClazzA = new MyClazz();
        // myClazzA.hello();
    }
}

class A {

    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     return super.clone();
    // }
}
