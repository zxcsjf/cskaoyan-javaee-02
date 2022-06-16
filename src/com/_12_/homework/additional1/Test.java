package com._12_.homework.additional1;

/**
 * 1. 将以下代码复制到IDEA中，然后分析过程和结果。思考结果为什么会如此，提供必要的文字说明。
 * @author zxcsjf
 * @since 2022/06/16 21:40
 */
public class Test {
    public static void main(String[] args) {
        Father f1 = new Son(1000);
        Father f2 = new Father();
        Son s = new Son(1000);
    }
}

class Father {
    int i = 10;

    public Father() {
        System.out.println(getI());
    }

    public int getI() {
        return i;
    }
}

class Son extends Father {
    int i = 100;

    public Son(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}

