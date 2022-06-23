package com._16_string.test;

/**
 * @author zxcsjf
 * @since 2022/06/22 10:57
 */
public class FromatStringTest {
    public static void main(String[] args) {
        // %s表示输出字符串，也就是将后面的字符串替换模式中的%s
        System.out.printf("%s", new Integer(1212));
        // %n表示换行
        System.out.printf("%s%n", "end line");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.print(String.format("%03d%n", i));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
