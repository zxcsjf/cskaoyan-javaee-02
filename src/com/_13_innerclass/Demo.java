package com._13_innerclass;


/**
 * @author zxcsjf
 * @since 2022/06/16 23:10
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Outer.test());
    }
}

class Outer {
    public int num = 10;
    class Inner {
        public int num = 20;

        public void show() {
            int num = 30;
            System.out.println(new Outer().num);
            System.out.println(new Outer().new Inner().num);
            System.out.println(num);
        }
    }

    public static Object test() {
        return 1;
    }
}

