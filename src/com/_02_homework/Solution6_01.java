package com._02_homework;

/**
 * 方法是Java代码中最常用的语法结构，这里对方法的语法做一下练习。
 * 在使用方法或者想要写一个方法时，首先要考虑的是方法需要的参数是什么数据类型，需要几个（形式参数），
 * 再考虑方法需要返回什么结果（返回值类型）。在调用方法时，需要搞清楚具体传入什么数值（实际参数）。
 * 实现以下需求：
 * <p>
 * 使用for循环遍历n以内的奇数，并计算所有的奇数的和并输出。
 * <p>
 * (我认为包括n
 *
 * @author zxcsjf
 * @since 2022/06/07 19:03
 */
public class Solution6_01 {

    public static void main(String[] args) {
        getOddNum(10);
    }

    private static void getOddNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(n + "以内所有的奇数的和是：" + sum);
    }


}
