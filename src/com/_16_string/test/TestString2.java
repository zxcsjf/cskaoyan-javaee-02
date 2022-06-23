package com._16_string.test;

/**
 * @author zxcsjf
 * @since 2022/06/22 14:56
 */
public class TestString2 {
    public static void main(String[] args) { // args[0] "abc", args[1] "abc"
        String s1 = "a";
        String s2 = "abc";
        System.out.println(args[0] == s2);
        System.out.println(args[1] == s2);
    }
}