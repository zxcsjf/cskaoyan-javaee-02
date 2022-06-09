package com._04_method;

/**
 * @author zxcsjf
 * @since 2022/06/09 12:41
 */
public class Stack {
    private static int count;

    public static void main(String[] args) {
        try {
            test();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }

    private static void test() {
        count++;
        test();
    }
}
