package com._05_oop._05_homework;

/**
 * 可变参数练习
 * 可变参数的本质是数组，完成下列需求：
 * <p>
 * 求不限定个数参数的最大值（要求使用可变参数，使用int类型即可）
 * <p>
 * 注：该题很简单，练习语法即可。
 *
 * @author zxcsjf
 * @since 2022/06/10 18:41
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(getMaxValueOfSomeNumbers(1, 3, 4, 21, 321));
    }

    private static int getMaxValueOfSomeNumbers(int... arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }
}
