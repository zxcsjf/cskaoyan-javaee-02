package com._16_string.test;

/**
 * @author zxcsjf
 * @since 2022/06/22 16:08
 */
public class InternTest {
    public static void main(String[] args) {
        String str2 = new String("str")+new String("01");
        str2.intern(); //1.6
        String str1 = "str01";
        System.out.println(str2==str1);//#7 1.7 true, 1.6 false
    }
}
