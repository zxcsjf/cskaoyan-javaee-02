package com._03_arrays._03_homework;

/**
 * 对于任意两个字符串对象的引用str1，str2。
 * 怎么判断这两个字符串对象的内容相同呢？
 * 思考一下，写出你的答案。
 *
 * @author zxcsjf
 * @since 2022/06/09 19:40
 */
public class Solution7 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = null;
        System.out.println(judgeStringContains(str1, str2));
    }

    private static boolean judgeStringContains (String str1, String str2) {
        // 相同返回true，反之false
        if (str1 == null && str2 == null) {
            return true;
        }
        if (str1 == null) {
            return false;
        }
        return str1.equals(str2);
    }
}
