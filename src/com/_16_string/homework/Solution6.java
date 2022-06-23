package com._16_string.homework;

/**
 * 判断一个字符串是否是对称字符串,
 * 例如"abc"不是对称字符串，
 * "aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 提示: 判断一个字符串是否是对称的字符串
 * ，我只需要把 第一个和最后一个比较 第二个和倒数第二个比较 ...
 * 可以借助StringBuffer
 * @author zxcsjf
 * @since 2022/06/21 20:31
 */
public class Solution6 {
    public static void main(String[] args) {
        String str = "ab";
        System.out.println(str.hashCode());
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        if (reverse.equals(str)) {
            System.out.println(str + "是对称字符串");
            return;
        }
        System.out.println(str + "不是对称字符串！！！");
    }
}
