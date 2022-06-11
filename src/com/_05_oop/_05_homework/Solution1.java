package com._05_oop._05_homework;

/**
 * 上述main方法不变，修改method方法实现，让程序输出：  a = 20  b = 40  如何实现呢？  注：这是个脑筋急转弯，不会的可以互相问问或者查一查。
 *
 * @author zxcsjf
 * @since 2022/06/10 19:47
 */
public class Solution1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void method(int a, int b) {
        System.out.println("a = " + 20);
        System.out.println("b = " + 40);
        System.exit(0);
    }
}
