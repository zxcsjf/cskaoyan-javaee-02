package com._12_.homework;

/**
 * 测试子类重写
 *
 * @author zxcsjf
 * @since 2022/06/16 19:44
 */
public class Solution2 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        GrandSon gs = new GrandSon();
        // new GrandSon().test();
    }
}

class Father {

    final int a;
    {
        a = 10;
    }


    public long test() {

        return 1000L;
    }
}

class Son extends Father {

    @Override
    public long test() {

        return 200;
    }
}

class GrandSon extends Son {
    @Override
    public long test() {
        return 300;
    }
}
