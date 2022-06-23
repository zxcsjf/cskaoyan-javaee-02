package com._16_string.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zxcsjf
 * @since 2022/06/21 14:27
 */
public class Demo2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo!";
        String s32 = "Hel".concat( "lo!");
        System.out.println(s32 == s3);
        String s33 = "Hello!!".intern();
        String s34 = new String("Hello!!");
        System.out.println(s33 == s34);
        String s35 = "Hel";
        s35 += "lo!";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println("s1.startsWith(\"\") = " + s1.startsWith(""));
        System.out.println("".compareTo("\u0000"));

        // System.out.println(String.valueOf(new char[]{33, 34, 35}));
        // System.out.println(Arrays.toString(s1.toCharArray()));
        // System.out.println(Arrays.toString(s1.split("")));
        //
        // Character c = 'a';
        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s1 == s4);
        // System.out.println(s1 == s9);
        // System.out.println(s4 == s5);
        // System.out.println(s3 == ("He" + "llo"));
        //
        //
        // System.out.println("----------------");
        // String str1 = new StringBuilder("计算机").append("软件").toString();
        // System.out.println(str1.intern() == str1);
        //
        // String str2 = new StringBuilder("ja").append("va").toString();
        // System.out.println(str2.intern() == str2);
        //
        // String str = "adjskfds";
        // char[] chars = str.toCharArray();
        // // System.out.println(bubbleSort(chars));
        //
        // Arrays.sort(chars);
        // System.out.println(chars);

        StringBuffer sb = new StringBuffer("abc");
        String str = "abc";
        StringBuffer sb2 = new StringBuffer(str);
        System.out.println(sb2.equals(sb));

    }

    private static char[] bubbleSort(char[] chars) {
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - 1 - i; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        return chars;
    }
}
