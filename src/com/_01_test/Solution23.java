package com._01_test;

/**
 * 以下小需求，使用循环完成即可。
 * 计算 2 + 4 + 6 + … + 100 的值。
 * 计算2000年1月1日到2008年1月1日相距多少天。（注意闰年）
 * 循环输入一个不为0的数进行累加，直到输入的数字为0，结束循环并最后输出累加的结果。  三个需求，可以写三个main方法，自己尝试即可。
 *
 * @author zxcsjf
 * @since 2022/06/06 20:33
 */
public class Solution23 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("2 + 4 + 6 + … + 100 的值:" + sum);

        int numberOfYears = 2008 - 2000;
        int days = numberOfYears * 365 + numberOfYears / 4;
        System.out.println("2000年1月1日到2008年1月1日相距" + days + "天。");


    }
}
